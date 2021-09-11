package fr.epita.bank.datamodel;

public class Customer {

    private String name;
    private  String address;

// This is constructor, why because the name and address are private
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //Getter and setter
    /*Setter as a validation rule, where we can say what type of data we want */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.startsWith("1")) {
            System.out.println("invalid name");
            return;
        }
        this.name = name;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
