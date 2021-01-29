package by.teachmeskills.springboot.model.clients;

import by.teachmeskills.springboot.entity.adress.AddressEntity;
import by.teachmeskills.springboot.model.AbstractModel;

public class ClientsModel extends AbstractModel {
    private String firstName;
    private String lastName;
    private AddressEntity address;

    public ClientsModel() {
    }

    public ClientsModel(String firstName, String lastName, AddressEntity address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }
}
