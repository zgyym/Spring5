package com.service;

import com.pojo.Book;

import java.util.List;

public interface BookService {
    void add(Book book);
    void del(int id);
    void update(Book book);

    int selectCount();
    Book getBookById(int id);
    List<Book> getBookList();

    void batchAdd(List<Object[]> batchArgs);
    void batchDel(List<Object[]> batchArgs);
    void batchUpdate(List<Object[]> batchArgs);
}
