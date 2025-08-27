package com.example.LibraryManagement;

public class Book {
    private int id;
    private String title;
    private String author;

    public Book(){}

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
    }
}
