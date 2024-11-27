package com.mentos74.domain;

public class Book {
    private String title;
    private Author author;

    public Book(Author author){
        this.author = author;
    }
}
