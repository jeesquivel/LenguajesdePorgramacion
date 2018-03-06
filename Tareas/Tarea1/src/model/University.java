
package model;

/**
 * @author Jeison
 */
public class University {

    
    
    
    private String name;            // nombre de la u
    private int legalDocument;      // cedula  juridica
    
    
    
    public University() {
    }
    

    /**
     * Constructor del la clase
     * @param name              nombre
     * @param legalDocument     cedula juridica
     */
    public University(String name, int legalDocument) {
        this.name = name;
        this.legalDocument = legalDocument;
    }
    
}
