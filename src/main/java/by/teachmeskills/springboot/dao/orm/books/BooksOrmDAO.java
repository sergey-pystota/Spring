package by.teachmeskills.springboot.dao.orm.books;

import by.teachmeskills.springboot.dao.books.BooksDAO;
import by.teachmeskills.springboot.dao.orm.OrmAbstractDAO;
import by.teachmeskills.springboot.entity.book.BookEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BooksOrmDAO extends OrmAbstractDAO<BookEntity> implements BooksDAO {
    @Override
    protected Class<BookEntity> getEntityClass() {
        return BookEntity.class;
    }

    @Override
    public Optional<BookEntity> getByTitle(String title) {
        return null;
    }

    @Override
    public Optional<BookEntity> getByAuthor(String title) {
        return null;
    }
}
