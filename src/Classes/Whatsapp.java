package Classes;

import Enums.Status;

public class Whatsapp {
    private int id;
    private long phoneNumber;
    private String password;
    private String userName;
    private Status status;

    public Whatsapp(int id, long phoneNumber, String password, String userName, Status status) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public String getInfoWhatsapp(){
        System.out.printf("""
                Id : %s
                Phone number : %s
                Password : %s
                User name : %s
                Status : %s
                """,getId(),getPhoneNumber(),getPassword(),getUserName(),getStatus());
        return "Install whatsapp";
    }

}
