package com.notes.devops;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesService {
    private final NotesRepository NotesRepository;

    public NotesService(NotesRepository NotesRepository){
        this.NotesRepository=NotesRepository;
    }

    public List<NotesModel> getAllNotes(){
        return NotesRepository.findAll();
    }

    public NotesModel addNotes(NotesModel notesModel){
        return NotesRepository.save(notesModel);
    }
}
