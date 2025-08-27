package com.example.LibraryManagement;

import java.util.List;

public class Library {
    private String name;
    private List<Book> books;

    private Member member;


    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setMemberId(Member member) {
        this.member = member;
    }

    public void displayDetails()
    {
        System.out.println("Library: " + name);
        System.out.println("Member: " + member);
        System.out.println("Books: ");
        for(Book book : books)
        {
            System.out.println(book);
        }
    }
}
