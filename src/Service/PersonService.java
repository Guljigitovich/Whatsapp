package Service;

import Classes.Person;
import Enums.Gender;
import Enums.Region;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface PersonService {




    void createPerson (List<Person>people);
     void getPassportByFirstName(String name, List<Person>people);
     void getAllGender ();
     void getAllPassport();
    }