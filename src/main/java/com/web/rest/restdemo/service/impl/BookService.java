package com.web.rest.restdemo.service.impl;

import com.web.rest.restdemo.domain.Book;
import com.web.rest.restdemo.repository.BookRepository;
import com.web.rest.restdemo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
public class BookService implements IBookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> findAll() {
        List<Book> books = new LinkedList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }


    @Transactional
    @Override
    public void createBook(Book book) {
        bookRepository.save(book);
    }
}
