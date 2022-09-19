package com.abhinash.learning.repository;

import com.abhinash.learning.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
