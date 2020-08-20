package com.hookten.bookmanager.service;

import com.hookten.bookmanager.dao.BookDao;
import com.hookten.bookmanager.dao.BookDaoImpl;
import com.hookten.bookmanager.dao.model.Book;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;


    @Override
    @Transactional
    public void addBook(Book book) {
        this.bookDao.addBook(book);

    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        this.bookDao.updateBook(book);
    }

    @Override
    @Transactional
    public void removeBook(int id) {
        this.bookDao.removeBook(id);
    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return this.bookDao.getBookById(id);
    }

    @Override
    @Transactional
    public List<Book> listBooks() {
        return this.bookDao.listBook();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookDao getBookDao() {
        return bookDao;
    }
}
