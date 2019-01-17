package lk.ijse.csco.entity;

public class ClothCategory extends lk.ijse.csco.entity.SuperEntity {

    private String ccid;
    private String pe_category;
    private String type;

    public ClothCategory() {
    }

    public ClothCategory(String ccid, String pe_category, String type) {
        this.ccid = ccid;
        this.pe_category = pe_category;
        this.type = type;
    }

    public String getCcid() {
        return ccid;
    }

    public void setCcid(String ccid) {
        this.ccid = ccid;
    }

    public String getPe_category() {
        return pe_category;
    }

    public void setPe_category(String pe_category) {
        this.pe_category = pe_category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
