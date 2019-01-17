package lk.ijse.csco.dto;

public class CustomerDTO extends SuperDTO {

    private String cid;
    private String name;
    private String tell;

    public CustomerDTO() {
    }

    public CustomerDTO(String cid, String name, String tell) {
        this.cid = cid;
        this.name = name;
        this.tell = tell;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }
}
