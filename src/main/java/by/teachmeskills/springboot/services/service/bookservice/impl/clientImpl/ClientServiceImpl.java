package by.teachmeskills.springboot.services.service.bookservice.impl.clientImpl;

import by.teachmeskills.springboot.converter.IConverter;
import by.teachmeskills.springboot.dao.client.ClientDAO;
import by.teachmeskills.springboot.entity.client.ClientEntity;
import by.teachmeskills.springboot.model.clients.ClientsModel;
import by.teachmeskills.springboot.services.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl extends AbstractService implements IClientService {
    ClientDAO clientDAO;
    IConverter<ClientsModel, ClientEntity> converter;

    @Autowired
    public void setClientDAO(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @Autowired
    public void setConverter(IConverter<ClientsModel, ClientEntity> converter) {
        this.converter = converter;
    }

    @Override
    public List<ClientsModel> getAllClients() {
        return converter.convertAllToModels(clientDAO.getAll());
    }

    @Override
    public ClientsModel getClientById(Long id) {
        return null;
    }

    @Override
    public ClientsModel addClient(ClientsModel clientsModel) {
        return null;
    }
}
