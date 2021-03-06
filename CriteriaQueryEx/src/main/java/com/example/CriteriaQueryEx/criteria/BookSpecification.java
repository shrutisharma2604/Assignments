package com.example.CriteriaQueryEx.criteria;

import org.springframework.data.jpa.domain.Specification;

class BookSpecifications {

    public static Specification<Book> hasAuthor(String author) {
        return (book, cq, cb) -> cb.equal(book.get("author"), author);
    }

    public static Specification<Book> titleContains(String title) {
        return (book, cq, cb) -> cb.like(book.get("title"), "%" + title + "%");
    }

}
