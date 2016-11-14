package dima.litvinenko.model;

import javax.persistence.Entity;

@Entity(name="contacts")
public class Contact extends BaseModel{

    private String firstName;
    private String lastName;
    private String emailAdress;
    private String telephoneNumber;
    private String address1;
    private String address2;
    private String city;
    private String postCode;
}
