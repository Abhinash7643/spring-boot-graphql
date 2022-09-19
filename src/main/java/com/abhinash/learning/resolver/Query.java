package com.abhinash.learning.resolver;

import com.abhinash.learning.model.Author;
import com.abhinash.learning.model.Tutorial;
import com.abhinash.learning.repository.AuthorRepository;
import com.abhinash.learning.repository.TutorialRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private final AuthorRepository authorRepository;
    private final TutorialRepository tutorialRepository;

    @Autowired
    public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
        this.authorRepository = authorRepository;
        this.tutorialRepository = tutorialRepository;
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public Iterable<Tutorial> findAllTutorials() {
        return tutorialRepository.findAll();
    }

    public String countAuthors() {
        return String.valueOf(authorRepository.count());
    }

    public int countTutorials() {
        return (int) tutorialRepository.count();
    }
}
