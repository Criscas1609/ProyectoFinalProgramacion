package co.edu.cue.proyectofinalcorte3.model;

public class Client extends Person {


    private String phoneNumber;
    private String address;


    public Client(String name, String lastName, String gender, String birthday, String id, String phoneNumber, String address) {
        super(name, lastName, gender, birthday, id);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
