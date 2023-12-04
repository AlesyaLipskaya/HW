package proj.model;

import java.time.LocalDateTime;

public class Transaction {
    private String fileName;
    private String status;
    private LocalDateTime dateTime;

    // Геттеры и сеттеры

    @Override
    public String toString() {
        return dateTime + " | " + fileName + " | " + status;
    }

    public void setFileName(String file) {
    }

    public void setStatus(String успешноОбработан) {
    }

    public void setDateTime(LocalDateTime now) {
    }
}