package by.teachmeskills.springboot.dao.books;

import by.teachmeskills.springboot.dao.DAO;
import by.teachmeskills.springboot.entity.book.BookEntity;

import java.util.Optional;

public interface BooksDAO extends DAO<BookEntity> {
   Optional<BookEntity> getByTitle(String title);
    Optional<BookEntity> getByAuthor(String title);

}
