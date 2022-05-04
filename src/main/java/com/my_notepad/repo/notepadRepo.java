package com.my_notepad.repo;

import com.my_notepad.model.notepad_fieds;
import org.springframework.data.jpa.repository.JpaRepository;
public interface notepadRepo extends JpaRepository<notepad_fieds, Long> {
}
