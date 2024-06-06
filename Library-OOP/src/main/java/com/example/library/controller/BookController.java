package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.library.repository.BookRepository;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public String findAll(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "bookList";
    }
}
