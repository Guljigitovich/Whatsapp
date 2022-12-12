package Impl;

import Classes.Person;
import Enums.Gender;
import Enums.Region;
import Service.PersonService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PersonImpl implements PersonService {
    private final List<Person> personList = new ArrayList<>();

    @Override
    public void createPerson(List<Person> people) {
        try {
            System.out.print("Enter your ID : ");
            int id = new Scanner(System.in).nextInt();

            System.out.print("Last Name : ");
            String lastName = new Scanner(System.in).nextLine();

            System.out.print("First Name : ");
            String firstName = new Scanner(System.in).nextLine();

            System.out.print("Enter your date of birth (yy-mm-dd) : ");
            String[] dateOfBirthList = new Scanner(System.in).nextLine().trim().split("-");

            System.out.print("Enter your region : ");
            String region = new Scanner(System.in).nextLine();

            System.out.print("Enter your gender : ");
            String gender = new Scanner(System.in).nextLine();

            if(id < 0 ) throw new Exception("ID validation error.");
            if(firstName.isEmpty() || lastName.isEmpty() || gender.isEmpty() || region.isEmpty())
                throw new Exception("Empty input Exception. Please fill the all given forms.");
            if(dateOfBirthList.length != 3)
                throw new Exception("Date of Birth Validation Error.");

            LocalDate dateOfBirth =
                    LocalDate.of(Integer.parseInt(dateOfBirthList[0]),
                            Integer.parseInt(dateOfBirthList[1]),Integer.parseInt(dateOfBirthList[2]));

            Person newPerson = new Person(id,lastName, firstName,dateOfBirth,Region.valueOf(region),Gender.valueOf(gender));
            personList.add(newPerson);
            System.out.println("Person created successfully." );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void getPassportByFirstName(String name, List<Person> people) {
        for (Person personArray : people) {
            if (name.equals(personArray.getFirstName())) {
                System.out.println(personArray.getInfoPerson());
            }
        }
    }

    @Override
    public void getAllGender() {
        for (Gender gender : Gender.values()) {
            System.out.println(gender);
        }
    }

    @Override
    public void getAllPassport() {

    }

    public void getRegion() {
        for (Region region : Region.values()) {
            System.out.println(region);
        }
    }
}
