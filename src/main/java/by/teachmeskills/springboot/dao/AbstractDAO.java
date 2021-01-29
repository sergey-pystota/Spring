package by.teachmeskills.springboot.dao;


import by.teachmeskills.springboot.entity.IEntity;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO<T extends IEntity> implements DAO<T> {
    protected Logger logger;

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}

