package co.edu.cue.proyectofinalcorte3.model;

public class Administrative extends Person{

    private String experience;

    private String hiringDate; //Fecha de contratación o años que lleva en la empresa


    public Administrative(String name, String lastName, String gender, String birthday, String id, String experience, String hiringDate) {
        super(name, lastName, gender, birthday, id);
        this.experience = experience;
        this.hiringDate = hiringDate;
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
