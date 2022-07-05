package com.dao.impl;

import com.dao.BookDAO;
import com.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "bookDAO")      //默认值为bookDAOImpl
public class BookDAOImpl implements BookDAO {

    @Autowired
    @Qualifier(value = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        //sql语句
        String sql = "insert into t_book values(0,?,?)";
        Object[] args = {book.getBookName(), book.getBookStatus()};
        jdbcTemplate.update(sql, args);
    }

    @Override
    public void del(int id) {
        String sql = "delete from t_book where id = ?";
        jdbcTemplate.update(sql, id);

    }

    @Override
    public void update(Book book) {
        String sql = "update t_book set bookName = ?,bookStatus = ? where id = ?";
        Object[] args = {book.getBookName(), book.getBookStatus(),book.getId()};
        jdbcTemplate.update(sql, args);

    }

    //查询表中记录数
    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book getBookById(int id) {
        String sql = "select * from t_book where id = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> getBookList() {

        String sql = "select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(0,?,?)";
        jdbcTemplate.batchUpdate(sql,batchArgs);
    }

    @Override
    public void batchDel(List<Object[]> batchArgs) {
        String sql = "delete from t_book where id = ?";
        jdbcTemplate.batchUpdate(sql,batchArgs);
    }

    @Override
    public void BatchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set bookName = ?,bookStatus = ? where id = ?";
        jdbcTemplate.batchUpdate(sql,batchArgs);
    }

}

