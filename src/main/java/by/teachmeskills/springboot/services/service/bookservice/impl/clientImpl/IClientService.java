package by.teachmeskills.springboot.services.service.bookservice.impl.clientImpl;

import by.teachmeskills.springboot.model.books.BookModel;
import by.teachmeskills.springboot.model.clients.ClientsModel;

import java.util.List;

public interface IClientService {
    List<ClientsModel> getAllClients();

    ClientsModel getClientById(Long id);

    ClientsModel addClient(ClientsModel clientsModel);
}
