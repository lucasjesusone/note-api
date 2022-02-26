package com.ms.crud.repositories;

import com.ms.crud.models.NoteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface NoteRepository extends JpaRepository<NoteModel, Integer> {

    NoteModel findByNoteId(Integer noteId);

}
