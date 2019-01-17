package lk.ijse.csco.dto;

public class ClothDTO extends SuperDTO {

    private String clid;
    private String ccid;
    private String color;
    private String size;
    private double price;
    private int qty;
    private String barCode;

    public ClothDTO() {
    }

    public ClothDTO(String clid, String ccid, String color, String size, double price, int qty, String barCode) {
        this.clid = clid;
        this.ccid = ccid;
        this.color = color;
        this.size = size;
        this.price = price;
        this.qty = qty;
        this.barCode = barCode;
    }

    public String getClid() {
        return clid;
    }

    public void setClid(String clid) {
        this.clid = clid;
    }

    public String getCcid() {
        return ccid;
    }

    public void setCcid(String ccid) {
        this.ccid = ccid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
}
