package com.service.impl;

import com.dao.BookDAO;
import com.pojo.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "bookService")     //默认值为bookServiceImpl
public class BookServiceImpl implements BookService {

    @Autowired
    @Qualifier(value = "bookDAO")
    private BookDAO bookDAO;

    @Override
    public void add(Book book) {
        bookDAO.add(book);
    }

    @Override
    public void del(int id) {
        bookDAO.del(id);
    }

    @Override
    public void update(Book book) {
        bookDAO.update(book);
    }

    //查询表中记录数
    @Override
    public int selectCount() {
        return bookDAO.selectCount();
    }

    @Override
    public Book getBookById(int id) {
        return bookDAO.getBookById(id);
    }

    @Override
    public List<Book> getBookList() {
        return bookDAO.getBookList();
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        bookDAO.batchAdd(batchArgs);
    }

    @Override
    public void batchDel(List<Object[]> batchArgs) {
        bookDAO.batchDel(batchArgs);
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        bookDAO.BatchUpdate(batchArgs);
    }


}
