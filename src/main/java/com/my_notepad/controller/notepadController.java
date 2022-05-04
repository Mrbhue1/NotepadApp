package com.my_notepad.controller;

import com.my_notepad.model.notepad_fieds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class
notepadController {

    @Autowired
    public com.my_notepad.repo.notepadRepo notepadRepo;
    @GetMapping("/")
    public String h(){
        return "hello peter";
    }
    @PostMapping("/save")
    public String create(@RequestBody notepad_fieds nf){
        notepadRepo.save(nf);
        return "note created....";
    }

    @GetMapping("/view")
    public List<notepad_fieds> viewNotes(){
        return notepadRepo.findAll();
    }
    @PutMapping("/updateNotes/{id}")
    public String update(@PathVariable long id,@RequestBody notepad_fieds nf1){
        notepad_fieds updateNotes= notepadRepo.findById(id).get();
        updateNotes.setTitle(nf1.getTitle());
        updateNotes.setNotes(nf1.getNotes());
        notepadRepo.save(nf1);

        return "Note Updated.....";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        notepad_fieds deleteNotes= notepadRepo.findById(id).get();
        notepadRepo.delete(deleteNotes);

        return "Note Deleted.....";
    }

}
