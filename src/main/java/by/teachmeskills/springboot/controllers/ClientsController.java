package by.teachmeskills.springboot.controllers;

import by.teachmeskills.springboot.model.clients.ClientsModel;
import by.teachmeskills.springboot.services.service.bookservice.impl.clientImpl.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/clients")
public class ClientsController {
    IClientService clientService;

    @Autowired
    public void setClientService(IClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ModelAndView getClients() {

        return new ModelAndView("clients", "clients", clientService.getAllClients());
    }
}

