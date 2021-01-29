package by.teachmeskills.springboot.converter.client;

import by.teachmeskills.springboot.converter.AbstractConverter;
import by.teachmeskills.springboot.entity.client.ClientEntity;
import by.teachmeskills.springboot.model.clients.ClientsModel;
import org.springframework.stereotype.Component;

@Component
public class ClientConverter extends AbstractConverter<ClientsModel, ClientEntity> {
    @Override
    protected ClientsModel convertEntity(ClientEntity entity, ClientsModel model) {
        model.setFirstName(entity.getFirstName());
        model.setLastName(entity.getLastName());
        model.setAddress(entity.getAddress());
        return model;
    }

    @Override
    protected ClientEntity convertModel(ClientsModel model, ClientEntity entity) {
        entity.setFirstName(model.getFirstName());
        entity.setLastName(model.getLastName());
        entity.setAddress(model.getAddress());
        return entity;
    }

    @Override
    protected ClientsModel createModel() {
        return new ClientsModel();
    }

    @Override
    protected ClientEntity createEntity() {
        return new ClientEntity();
    }
}
