package by.teachmeskills.springboot.services.service.bookservice.impl.bookimpl;


import by.teachmeskills.springboot.converter.IConverter;
import by.teachmeskills.springboot.dao.books.BooksDAO;
import by.teachmeskills.springboot.dao.exceptions.DAOException;
import by.teachmeskills.springboot.entity.book.BookEntity;
import by.teachmeskills.springboot.model.books.BookModel;
import by.teachmeskills.springboot.services.service.AbstractService;
import by.teachmeskills.springboot.services.service.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl extends AbstractService implements IBookService {

    private BooksDAO booksDAO;
    private IConverter<BookModel, BookEntity> bookconv;

    @Override
    public List<BookModel> getAllBooks() {
        return bookconv.convertAllToModels(booksDAO.getAll());
    }

    @Override
    public BookModel getBookById(Long id)  {
        Optional<BookEntity> entityOptional = booksDAO.getEntity(id);
        return entityOptional
            .map(productEntity -> bookconv.convertToModel(productEntity))
            .orElseThrow(() -> new ServiceException("Product with id: " + id + " not found"));
    }

    @Override
    public BookModel addBook(BookModel bookModel) {
        BookEntity createdEntity;
        try {
            createdEntity = booksDAO.create(bookconv.convertToEntity(bookModel));
        } catch (DAOException | SQLException e) {
            throw new ServiceException("Unable to create product: " + e.getMessage(), e);
        }
        return bookconv.convertToModel(createdEntity);
    }

    @Autowired
    public void setBooksDAO(BooksDAO bookDAO) {
        this.booksDAO = bookDAO;
    }

    @Autowired
    public void setBookConv(IConverter<BookModel, BookEntity> bookconv) {
        this.bookconv = bookconv;
    }
}
