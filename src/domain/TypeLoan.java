package domain;

/**
 * Created by Jeison on 06/03/2018.
 */
public class TypeLoan {

    private int id;
    private String type;
    private int hourAvailability;
    private int daysAvailibility;
    private double mult;

    public TypeLoan(int id, String type, int hourAvailability, int daysAvailibility, double mult) {
        this.id = id;
        this.type = type;
        this.hourAvailability = hourAvailability;
        this.daysAvailibility = daysAvailibility;
        this.mult = mult;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHourAvailability() {
        return hourAvailability;
    }

    public void setHourAvailability(int hourAvailability) {
        this.hourAvailability = hourAvailability;
    }

    public int getDaysAvailibility() {
        return daysAvailibility;
    }

    public void setDaysAvailibility(int daysAvailibility) {
        this.daysAvailibility = daysAvailibility;
    }

    public double getMult() {
        return mult;
    }

    public void setMult(double mult) {
        this.mult = mult;
    }
}
