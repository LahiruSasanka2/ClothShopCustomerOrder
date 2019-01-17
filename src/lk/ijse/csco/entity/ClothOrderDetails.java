package lk.ijse.csco.entity;

public class ClothOrderDetails extends lk.ijse.csco.entity.SuperEntity {

    private String coid;
    private String clid;

    public ClothOrderDetails() {
    }

    public ClothOrderDetails(String coid, String clid) {
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
