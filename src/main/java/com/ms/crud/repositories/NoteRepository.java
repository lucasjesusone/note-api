package com.ms.crud.repositories;

import com.ms.crud.entities.NoteModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NoteRepository extends JpaRepository<NoteModel, Integer> {

    NoteModel findByNoteId(Integer noteId);

}
