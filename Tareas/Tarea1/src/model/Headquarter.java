



package model;

import java.util.ArrayList;

/**
 *
 * @author Jeison
 */
class Headquarter  extends University{
    
    private String name;                                //nombre de la universidad
    private String ubication;                           // ubicacion
    private ArrayList<Vehicle> vehicles;                // arreglo de vehiculos de esa sede
    private ArrayList<Employee> employees;              // areglo de empleados que laboran en esa sede
    
    /*
    Constructor de la clase
    */
            
    public Headquarter() {
        super();
    }
    
    
    /**
     * Sobrecarga del constructor de la clase
     * @param name               nombre
     * @param legalDocument     cedula juridica
     */
    public Headquarter(String name, int legalDocument) {
        super(name, legalDocument);
    }
    
    
    
}
