package by.teachmeskills.springboot.dao.orm.clientorm;


import by.teachmeskills.springboot.dao.client.ClientDAO;
import by.teachmeskills.springboot.dao.orm.OrmAbstractDAO;
import by.teachmeskills.springboot.entity.client.ClientEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ClientOrmDAO extends OrmAbstractDAO<ClientEntity> implements ClientDAO {
    @Override
    public Optional<ClientEntity> getByName(String title) {
        return null;
    }

    @Override
    public Optional<ClientEntity> getBySurname(String title) {
        return null;
    }

    @Override
    protected Class<ClientEntity> getEntityClass() {
        return ClientEntity.class;
    }
}
