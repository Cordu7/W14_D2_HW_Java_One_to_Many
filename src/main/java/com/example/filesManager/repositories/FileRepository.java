package com.example.filesManager.repositories;

import com.example.filesManager.models.File;
import com.example.filesManager.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository <File, Long> {
}
