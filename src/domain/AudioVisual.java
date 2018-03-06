package domain;

/**
 * Created by Jeison on 06/03/2018.
 */
public class AudioVisual extends Assets {

    private String mark;
    private String detail;

    public AudioVisual(String id, String name,String mark, String detail,int quantity) {
        super(id, name, quantity);
        this.mark= mark;
        this.detail=detail;
    }
}
