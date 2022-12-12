package Impl;

import Classes.Person;
import Classes.Whatsapp;
import Enums.Status;
import Service.WhatsappService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhatsappImpl implements WhatsappService {

private final List<Whatsapp>whatsappList = new ArrayList<>();
    @Override
    public void installWhatsapp(List<Whatsapp> whatsapps,Status status) {
        this.whatsappList.addAll(whatsapps);
        System.out.println("Id : ");
        int id = new Scanner(System.in).nextInt();

        System.out.println("Phone number :");
        long phoneNumber = new Scanner(System.in).nextLong();

        System.out.println("Password : ");
        String password = new Scanner(System.in).nextLine();

        System.out.println("User name : ");
        String userName = new Scanner(System.in).nextLine();

        Whatsapp newWhatsapp = new Whatsapp(id,phoneNumber,password,userName,status);
        whatsappList.add(newWhatsapp);
        System.out.println(" Whatsapp install successfully.");

    }

    @Override
    public void changeStatus(String password, String statusName,List<Whatsapp>whatsapps) {
        Scanner scanner = new Scanner(System.in);
        for (Whatsapp whatsappArray:whatsapps) {
            for (Status status:Status.values()) {
                if (password.equals(whatsappArray.getPassword())) {
                    if (statusName.equals(status.getStatus())) {
                        System.out.println(status.getStatus());
                    } else {
                        System.out.println("ERROR");
                    }
                }
            }
            }


    } public void getAllStatus () {
        for (Status status : Status.values()) {
            System.out.println(status.getStatus());
        }

    }
    public  String addContact(String password,long phoneNumber,List<Whatsapp>whatsapps){
        for (Whatsapp whatsappArray:whatsapps) {
            if(password.equals(whatsappArray.getPassword())){
                if(phoneNumber == whatsappArray.getPhoneNumber()){
                    whatsappArray.setPhoneNumber(phoneNumber);

                }
            }
        }return "Add contact";
    }

    @Override
    public void sendMassage(String password, String userName, String message,List<Whatsapp>whatsappList) {
        for (Whatsapp whatsappArray : whatsappList) {
            if (password.equals(whatsappArray.getPassword()) && userName.equals(whatsappArray.getUserName())){

            }
        }
    }

    @Override
    public void goToYouProfile(String password,String userName,List<Whatsapp>whatsappList) {

        for (Whatsapp whatsapp : whatsappList) {
            if(whatsapp.getUserName().equals(userName) && whatsapp.getPassword().equals(password)){
                System.out.println(whatsapp);
            }
        }
    }
}
