package com.example.codeclan.filesandfolders.repository;

import com.example.codeclan.filesandfolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
