package by.teachmeskills.springboot.dao.client;


import by.teachmeskills.springboot.dao.DAO;
import by.teachmeskills.springboot.entity.book.BookEntity;
import by.teachmeskills.springboot.entity.client.ClientEntity;

import java.util.Optional;

public interface ClientDAO extends DAO<ClientEntity> {
    Optional<ClientEntity> getByName(String title);
    Optional<ClientEntity> getBySurname(String title);
}
