package com.example.CriteriaQueryEx.criteria;

import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.CriteriaQueryEx.criteria.BookSpecifications.hasAuthor;
import static com.example.CriteriaQueryEx.criteria.BookSpecifications.titleContains;
import static org.springframework.data.jpa.domain.Specification.where;


@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> query(String author, String title) {
        return bookRepository.findAll(where(hasAuthor(author)).and(titleContains(title)));
    }

}
