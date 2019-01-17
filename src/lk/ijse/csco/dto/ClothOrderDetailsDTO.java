package lk.ijse.csco.dto;

public class ClothOrderDetailsDTO extends SuperDTO {

    private String coid;
    private String clid;

    public ClothOrderDetailsDTO() {
    }

    public ClothOrderDetailsDTO(String coid, String clid) {
        this.coid = coid;
        this.clid = clid;
    }

    public String getCoid() {
        return coid;
    }

    public void setCoid(String coid) {
        this.coid = coid;
    }

    public String getClid() {
        return clid;
    }

    public void setClid(String clid) {
        this.clid = clid;
    }
}
