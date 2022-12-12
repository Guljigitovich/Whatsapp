import Classes.Person;
import Classes.Whatsapp;
import Enums.Gender;
import Enums.Region;
import Enums.Status;
import Impl.PersonImpl;
import Impl.WhatsappImpl;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person(2, "Saktanov", "Nursultan", LocalDate.of(1997,11,20), Region.NARYN, Gender.MALE);
        Person person1 = new Person(3, "Akmatov", "Myrzahan", LocalDate.of(1999,10,15), Region.TALAS, Gender.MALE);
        ArrayList<Person>people = new ArrayList<>(
                Arrays.asList(person,person1)
        );

        Whatsapp whatsapp = new Whatsapp(2,778242444,"kg77","Saktanov.kg", Status.WHATSAPP);
        Whatsapp whatsapp1 = new Whatsapp(3,550121113,"mk90","Akmatov.kg", Status.WHATSAPP);
        ArrayList<Whatsapp>whatsapps = new ArrayList<>(
                Arrays.asList(whatsapp,whatsapp1)
        );
        WhatsappImpl whatsapp2 = new WhatsappImpl();
        PersonImpl person2 = new PersonImpl();
        while (true){
            try {
                System.out.println("Write a number! ");
                Scanner scanner1 = new Scanner(System.in);
                int number = scanner1.nextInt();
                switch (number) {
                    case 1 -> {
                        System.out.println("Fill out a from .");
                        person2.createPerson(people);
                    }case 2 -> {
                        System.out.println("Write a first name : ");
                        String firstNameN = new Scanner(System.in).nextLine();
                         person2.getPassportByFirstName(firstNameN, people);

                    }case 3 -> {
                        person2.getAllGender();

                    }case 4 -> {
                         person2.getRegion();
                    }case 5 -> {
                        System.out.println("Write you password whatsapp:");
                        String passwordWhat =new Scanner(System.in).nextLine();
                        System.out.println("To whom to send a message. Write contact name:");

                    } case 6 -> {
                        whatsapp2.getAllStatus();
                    }case 7 -> {
                        whatsapp2.installWhatsapp(whatsapps,Status.WHATSAPP);
                    }case 8 -> {
                        System.out.println("Password : ");
                        String password = new  Scanner(System.in).nextLine();
                        System.out.println("Write new status : ");
                        String changeStatus = new Scanner(System.in).nextLine();
                        whatsapp2.changeStatus(password, changeStatus, whatsapps);
                    } case 9 -> {
                        System.out.println("Password : ");
                        String password = new  Scanner(System.in).nextLine();
                        System.out.println("Phone number : ");
                        long phoneNumber = new Scanner(System.in).nextLong();
                        System.out.println(whatsapp2.addContact(password, phoneNumber, whatsapps));
                    }case 10 -> {
                        System.out.println("Password :");
                        String password  = new Scanner(System.in).nextLine();
                        System.out.println("Urer name :");
                        String userName = new Scanner(System.in).nextLine();
                        whatsapp2.goToYouProfile(password,userName,whatsapps);

                    }
                    }
            } catch (InputMismatchException e) {
                System.out.println("You must write a number not a word");

            }
            }
    }
    static {
        System.out.printf("""
                Press 1 : Create person.
                Press 2 : Get passport by first name.
                Press 3 : Get all gender.
                Press 4 : Get all region.
                Press 5 : Send a message.
                Press 6 : Get all status.
                Press 7 : Install whatsapp.
                Press 8 : Change the status.
                Press 9 : Add contact.
                Press 10 : Go to you profile.
                """);
    }
}