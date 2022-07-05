package com.dao;

import com.pojo.Book;

import java.util.List;

public interface BookDAO {
    void add(Book book);
    void del(int id);
    void update(Book book);

    int selectCount();
    Book getBookById(int id);
    List<Book> getBookList();

    void batchAdd(List<Object[]> batchArgs);
    void batchDel(List<Object[]> batchArgs);
    void BatchUpdate(List<Object[]> batchArgs);
}
