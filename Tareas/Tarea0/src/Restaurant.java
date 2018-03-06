
import java.util.ArrayList;



/**
 *
 * @author Jeison
 */
public class Restaurant {
    
    private String name;                    // nombre del restaurante
    private String location;                // localizacion del restaurante
    private ArrayList<Person> people;       // personas involucradas en el restaurante
    private ArrayList<Table> tables;        // mesas del restaurante    

    
    /**
     * Constructor del restaurante
     * @param name
     * @param location 
     */
    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Restaurant() {
    }

    
    /*
    Lo siguiente son puros getters and settrers
    */
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void addTable(Table pTable){
        tables.add(pTable);
    }
    
    public void addPerson(Person pPerson){
        people.add(pPerson);
    }
    
    public void deleteTable(Table pTable){
        tables.remove(pTable);
    }
    
    public void deletePerson(Person pPerson){
        people.remove(pPerson);
    }
   
    
}
