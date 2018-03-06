package domain;

/**
 * Created by Jeison on 06/03/2018.
 */
public class TypeAsset {

    private int id;
    private String name;
    private String code;

    public TypeAsset(int id, String name, String type) {
        this.id = id;
        this.name= name;
        this.code = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return code;
    }

    public void setType(String type) {
        this.code = type;
    }
}
