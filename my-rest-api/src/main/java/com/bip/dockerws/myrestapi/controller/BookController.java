package com.bip.dockerws.myrestapi.controller;

import com.bip.dockerws.myrestapi.model.Book;
import com.bip.dockerws.myrestapi.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Slf4j
@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired BookRepository bookRepository;

    @PostConstruct
    public void init(){
        Book book = new Book();
        book.setId("docker-book");
        book.setName("Docker A2B");
        book.setAuthor("Lhan Mahn");
        bookRepository.save(book);
    }

    @RequestMapping("/query")
    public String saveSomeBooks() {

        log.info("/api/book/query is called..");
        Book book = bookRepository.findById("docker-book").get();
        return book.toString();
    }
}
