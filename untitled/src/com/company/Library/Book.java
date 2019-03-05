package com.company.Library;

public class Book {

    private int id;
    private String author;
    private String title;
    private String Genre;

    public Book(){}

    public Book(int id, String title){
        this.id = id;
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return Genre;
    }
}
