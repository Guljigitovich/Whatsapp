package Service;

import Classes.Person;
import Classes.Whatsapp;
import Enums.Status;

import java.util.List;

public interface WhatsappService {
    void installWhatsapp( List<Whatsapp>whatsapps,Status status);
    void changeStatus(String password,String statusName,List<Whatsapp>whatsapps);
    void getAllStatus();
    String addContact(String password,long phoneNumber,List<Whatsapp>whatsapps);
    void sendMassage (String password, String userName,String message,List<Whatsapp>whatsappList);
    void goToYouProfile(String password,String userName ,List<Whatsapp>whatsappList);

}
