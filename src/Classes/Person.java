package Classes;

import Enums.Gender;
import Enums.Region;

import java.time.LocalDate;

public class Person {
    private int id;
    private String lastName;
    private String firstName;
    private LocalDate birthday;
    private Region region;
    private Gender gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person(int id, String lastName, String firstName, LocalDate birthday, Region region, Gender gender) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.region = region;
        this.gender = gender;


     }public String getInfoPerson(){
        System.out.printf("""
                Id: %s
                Last name : %s
                First name: %s
                Birthday: %s
                Place of birth: %s
                Gender: %s
                """,getId(),getLastName(),getFirstName(),getBirthday(),getRegion(),getGender());
        return "Create Person!";
    }

}
