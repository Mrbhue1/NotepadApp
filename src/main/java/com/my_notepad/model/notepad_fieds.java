package com.my_notepad.model;

import javax.persistence.*;

@Table(name = "notepad")
@Entity


public class notepad_fieds {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false)
    private String title;

    private String notes;

    public notepad_fieds() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public notepad_fieds(Long id, String title, String notes) {
        this.id = id;
        this.title = title;
        this.notes = notes;
    }
}
