package by.teachmeskills.springboot.dao.orm;


import by.teachmeskills.springboot.dao.AbstractDAO;

import by.teachmeskills.springboot.dao.exceptions.DAOException;

import by.teachmeskills.springboot.entity.IEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public abstract class OrmAbstractDAO<T extends IEntity> extends AbstractDAO<T> {
    protected EntityManager entityManager;

    @Override
    @Transactional
    public T create(T entity) throws DAOException {
        try {
            entityManager.persist(entity);
            entityManager.refresh(entity);
            return entity;
        } catch (Exception e) {
            logger.error("Unable to save entity: {}", e.getMessage(), e);
            throw new DAOException("Unable to save entity: " + e.getMessage(), e);
        }
    }

    @Override
    @Transactional
    public Optional<T> getEntity(Long id) throws DAOException {
        try {
            return Optional.ofNullable(entityManager.find(getEntityClass(), id));
        } catch (Exception e) {
            logger.error("Unable to load entity: {}", e.getMessage(), e);
            throw new DAOException("Unable to load entity: " + e.getMessage(), e);
        }
    }

    @Override
    @Transactional
    public List<T> getAll() throws DAOException {
        try {
            CriteriaQuery<T> criteria = entityManager.getCriteriaBuilder().createQuery(getEntityClass());
            return entityManager.createQuery(criteria.select(criteria.from(getEntityClass()))).getResultList();
        } catch (Exception e) {
            logger.error("Unable to load entities: {}", e.getMessage(), e);
            throw new DAOException("Unable to load entities: " + e.getMessage(), e);
        }
    }

    @Override
    @Transactional
    public T updateEntity(T entity) throws DAOException {
        try {
            return entityManager.merge(entity);
        } catch (Exception e) {
            logger.error("Unable to update entity: {}", e.getMessage(), e);
            throw new DAOException("Unable to update entity: " + e.getMessage(), e);
        }
    }

    @Override
    @Transactional
    public void deleteEntity(Long id) throws DAOException {
        try {
            Optional<T> entityOptional = getEntity(id);
            entityOptional.ifPresent(entityManager::remove);
        } catch (Exception e) {
            logger.error("Unable to delete entity: {}", e.getMessage(), e);
            throw new DAOException("Unable to delete entity: " + e.getMessage(), e);
        }
    }

    protected abstract Class<T> getEntityClass();

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
