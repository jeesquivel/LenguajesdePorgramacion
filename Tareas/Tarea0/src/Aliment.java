

/**
 *
 * @author Jeison
 */


public class Aliment {
    private String name;                         // nombre del alimento
    private String description;                  // descripcion del alimento
    private double price;                        // precio o costo del alimento

    /**
     * 
     * @param name nombre del aliemento
     * @param description  del aliemnto
     * @param price  o costo del alimento
     */
    public Aliment(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Constructor
     */
    public Aliment() {
    }

    /**
     * Obtener nombre del restaurante
     * @return  nombre
     */
    public String getName() {
        return name;
    }

    /**
     * Asignar nombre al alimento o platillo
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna la descripcion del platillo
     * @return descripcion del platillo
     */
    public String getDescription() {
        return description;
    }

    /**
     * Asigna una descripcion al platillo
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retorna el precio del platillo
     * @return 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Asigna un precio al platillo
     * @param price 
     */
    public void setPrice(double pPrice) {
        if (pPrice>=0) {
            this.price = price;
        }
        else{
            System.err.println("Error: invalid food price");
        }
    }
    
    
}
