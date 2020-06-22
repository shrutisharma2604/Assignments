package com.example.SpringExercise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;

public interface BookRepository extends RevisionRepository<Book,Integer,Integer>, JpaRepository<Book,Integer> {
}
