
package model;
import java.util.Date;

/**
 *
 * @author Jeison Esquivel
 */
class Vehicle {

    
    
    private String brand;               // meodelo
    private String id;                  // placa del vehiculo
    private String color;               // color
    private int maxSpeed;               //velocidad maxima
    private int year;                   // anno
    private double mileage=0;           // kilometrage
    private int state=0;                // estado: 1 en uso, 0 disponible
    private Date dateUnavailability;    // fecha de no disponiblidad

    
    /**
     * Constructor
     */
    public Vehicle() {
    }
    
    /**
     * Sobrecarga del constructor
     * @param brand         modelo
     * @param color         color
     * @param maxSpeed      velocidad maxima
     * @param year          anno
     */
    public Vehicle(String pId,String brand, String color, int maxSpeed, int year) {
        this.id=pId;
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.year = year;
    }
    
    
    
    
    /*
    LO SIGUIENTE SON LOS GETTERS Y SETTERS
    */


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getDateUnavailability() {
        return dateUnavailability;
    }

    public void setDateUnavailability(Date dateUnavailability) {
        this.dateUnavailability = dateUnavailability;
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
