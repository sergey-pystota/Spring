package by.teachmeskills.springboot.converter.product;

import by.teachmeskills.springboot.converter.AbstractConverter;
import by.teachmeskills.springboot.entity.book.BookEntity;
import by.teachmeskills.springboot.model.books.BookModel;
import org.springframework.stereotype.Component;

@Component
public class BookConverter extends AbstractConverter<BookModel, BookEntity> {

    @Override
    protected BookModel convertEntity(BookEntity entity, BookModel model) {
        model.setTitle(entity.getTitle());
        model.setAuthor(entity.getAuthor());
        model.setDescription(entity.getDescription());
        model.setPrice(entity.getPrice());
        return model;
    }

    @Override
    protected BookEntity convertModel(BookModel model, BookEntity entity) {
        entity.setTitle(model.getTitle());
        entity.setAuthor(model.getAuthor());
        entity.setDescription(model.getDescription());
        entity.setPrice(model.getPrice());
        return entity;
    }



    @Override
    protected BookModel createModel() {
        return new BookModel();
    }

    @Override
    protected BookEntity createEntity() {
        return new BookEntity();
    }
}
