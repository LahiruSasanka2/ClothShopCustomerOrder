package lk.ijse.csco.entity;

public class Payment extends lk.ijse.csco.entity.SuperEntity {

    private String pid;
    private double amount;
    private double pePayAmount;

    public Payment() {
    }

    public Payment(String pid, double amount, double pePayAmount) {
        this.pid = pid;
        this.amount = amount;
        this.pePayAmount = pePayAmount;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPePayAmount() {
        return pePayAmount;
    }

    public void setPePayAmount(double pePayAmount) {
        this.pePayAmount = pePayAmount;
    }
}
