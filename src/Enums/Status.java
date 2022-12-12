package Enums;

public enum Status {
    WHATSAPP("Привет я использую ватсапп"),
    SLEEP("сплю"),
    WORK("на работе"),
    DINNER("обедаю"),
    SCHOOL("в школе"),
    PLAY("играю"),
    DISTURB("не беспокоить"),
    BOOK("читаю книгу"),
    CHAT("готов поболтать"),
    CALLS("только экстренные звонки");

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    Status(String status) {
        this.status = status;

    }
}
