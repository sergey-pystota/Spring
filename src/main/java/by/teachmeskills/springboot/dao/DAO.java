package by.teachmeskills.springboot.dao;


import by.teachmeskills.springboot.dao.exceptions.DAOException;
import by.teachmeskills.springboot.entity.IEntity;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface DAO<T extends IEntity> {
    T create(T entity) throws DAOException, SQLException;

    T updateEntity(T entity) throws DAOException;

    void deleteEntity(Long id) throws DAOException;

    List<T> getAll() throws DAOException;

    Optional<T> getEntity(Long id) throws DAOException;

}
