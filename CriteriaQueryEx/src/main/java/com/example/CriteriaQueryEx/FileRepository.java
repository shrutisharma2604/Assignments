package com.example.CriteriaQueryEx;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface FileRepository extends JpaRepository<File, Integer> {
}
