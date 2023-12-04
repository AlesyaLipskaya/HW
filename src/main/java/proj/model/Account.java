package proj.model;

public class Account {
    private String fromAccount;
    private String toAccount;
    private int transferAmount;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount != null ? toAccount : "DefaultToAccount"; // Дефолтное значение или обработка null
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }

    @Override
    public String toString() {
        return "Перевод с " + fromAccount + " на " + getToAccount() + " " + transferAmount;
    }
}



