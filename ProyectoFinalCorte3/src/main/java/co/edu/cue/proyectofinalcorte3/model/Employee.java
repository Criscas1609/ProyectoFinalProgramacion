package co.edu.cue.proyectofinalcorte3.model;

public class Employee extends Person {

    private String position;
    private String experience;
    private String hiringDate; //Fecha de contratación


    public Employee(String name, String lastName, String gender, String birthday, String id, String position, String experience, String hiringDate) {
        super(name, lastName, gender, birthday, id);
        this.position = position;
        this.experience = experience;
        this.hiringDate = hiringDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }
}
