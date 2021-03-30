package com.web.rest.restdemo.resource;


import com.web.rest.restdemo.domain.Book;
import com.web.rest.restdemo.dto.BookRequestDto;
import com.web.rest.restdemo.dto.BookResponseDto;
import com.web.rest.restdemo.dto.mapper.IBookMapper;
import com.web.rest.restdemo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookResource {

    private IBookService iBookService;


    @Autowired
    public BookResource(IBookService iBookService){
        this.iBookService = iBookService;
    }


    @GetMapping
    public ResponseEntity<List<Book>> all(){

        List<Book> books =  iBookService.findAll();
        return ResponseEntity.ok(books);
    }


    @PostMapping
    public ResponseEntity<BookResponseDto> createBook(@RequestBody BookRequestDto bookRequestDto){

        Book book = IBookMapper.INSTANCE.toBook(bookRequestDto);
        iBookService.createBook(book);

        BookResponseDto bookResponseDto = IBookMapper.INSTANCE.toBookResponseDto(book);
        return ResponseEntity.status(201).body(bookResponseDto);
    }
}
