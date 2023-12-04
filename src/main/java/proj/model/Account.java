package proj.model;

public class Account {
    private String fromAccount;
    private String toAccount;
    private int transferAmount;

    // Геттеры и сеттеры

    @Override
    public String toString() {
        return "Перевод с " + fromAccount + " на " + toAccount + " " + transferAmount;
    }

    public void setFromAccount(String part) {
    }

    public void setToAccount(String part) {
    }

    public void setTransferAmount(int i) {
    }
}