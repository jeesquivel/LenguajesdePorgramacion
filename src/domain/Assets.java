package domain;

import java.util.Date;

/**
 * Created by Jeison on 06/03/2018.
 */
public class Assets {

    private  String id;
    private String name;
    private int quantity;
    private Date dateAdmission;
    private String typeAsset;           //codigo del tipo de producto

    public Assets(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.dateAdmission=new Date();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(Date dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public String getTypeAsset() {
        return typeAsset;
    }

    public void setTypeAsset(String typeAsset) {
        this.typeAsset = typeAsset;
    }
}
