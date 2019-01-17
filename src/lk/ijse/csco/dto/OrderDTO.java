package lk.ijse.csco.dto;

public class OrderDTO extends SuperDTO {
    private String coid;
    private String cid;
    private String pid;
    private int qty;
    private String barCode;

    public OrderDTO() {
    }

    public OrderDTO(String coid, String cid, String pid, int qty, String barCode) {
        this.coid = coid;
        this.cid = cid;
        this.pid = pid;
        this.qty = qty;
        this.barCode = barCode;
    }

    public String getCoid() {
        return coid;
    }

    public void setCoid(String coid) {
        this.coid = coid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
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
