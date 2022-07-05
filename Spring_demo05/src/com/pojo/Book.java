package com.pojo;

public class Book {
    private Integer id;
    private String bookName;
    private String bookStatus;


    public Book() {
    }

    public Book(String bookName, String bookStatus) {
        this.bookName = bookName;
        this.bookStatus = bookStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookStatus='" + bookStatus + '\'' +
                '}';
    }
}


