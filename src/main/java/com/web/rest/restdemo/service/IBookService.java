package com.web.rest.restdemo.service;

import com.web.rest.restdemo.domain.Book;

import java.util.List;

public interface IBookService {

    public List<Book> findAll();


    public void createBook(Book book);
}
