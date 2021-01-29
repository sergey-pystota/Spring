package by.teachmeskills.springboot.services.service.bookservice.impl.bookimpl;


import by.teachmeskills.springboot.model.books.BookModel;

import java.util.List;

public interface IBookService {

    List<BookModel> getAllBooks();

    BookModel getBookById(Long id);

    BookModel addBook(BookModel bookModel);

}
