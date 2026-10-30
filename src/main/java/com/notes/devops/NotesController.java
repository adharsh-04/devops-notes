package com.notes.devops;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NotesController {
    private final NotesService NotesService;

    public NotesController(NotesService NotesService){
        this.NotesService=NotesService;
    }


    @GetMapping
    public List<NotesModel> getAllNotes() {
        return NotesService.getAllNotes();
    }

    @PostMapping("/addNote")
    public NotesModel addNote(@RequestBody NotesModel notesModel){
        return NotesService.addNotes(notesModel);
    }
}
