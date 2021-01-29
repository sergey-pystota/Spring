package by.teachmeskills.springboot.controllers;

import by.teachmeskills.springboot.model.books.BookModel;
import by.teachmeskills.springboot.services.service.ServiceException;
import by.teachmeskills.springboot.services.service.bookservice.impl.bookimpl.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bookshop")
public class BookController {

    private IBookService bookService;

    @Autowired
    public void setBookService(IBookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ModelAndView getBooks() {

        return new ModelAndView("books", "books", bookService.getAllBooks());
    }

    @ModelAttribute("book")
    public BookModel book() {
        return new BookModel();
    }

    @GetMapping("/add")
    public String addBook() {
        return "add-book";
    }

    @PostMapping("/add")
    public ModelAndView addBook(@ModelAttribute("book") BookModel bookM, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("add-book");
        }
        BookModel bookModel;
        try {
            bookModel = bookService.addBook(bookM);

        } catch (ServiceException e) {
            return new ModelAndView("add-book", "message", e.getMessage());
        }
        return new ModelAndView("redirect:/bookshop/books", "book", bookModel);
    }
}

