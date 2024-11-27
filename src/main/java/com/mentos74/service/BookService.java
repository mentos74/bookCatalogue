package com.mentos74.service;

import com.mentos74.domain.Author;
import com.mentos74.domain.Book;

public class BookService {
    private Book book;


    public BookService() {
        super();
        Author author = new Author();
        book = new Book(author);
    }

}
