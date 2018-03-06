
package model;

import java.util.Date;

/**
 *
 * @author Jeison
 */
class Employee {
    
    /**
     * lista de atributos
     */
    private String name;                            // nombre
    private String lastName;                        // apellidos
    private String identificationCart;                 // numero de identificacion
    private Date dateOfBird;                        // fecha de nacimiento
    private double salary;                          // salario
    private WorkingHour workingHour;

   
    /**
     * Constructor de la clase
     */
    public Employee() {
    }

    /**
     * Sobre carga del constructor
     * @param name                      nombre
     * @param lastName                  apellido
     * @param identificationCart        numero de identificacion
     * @param dateOfBird                fecha de nacimiento
     * @param salary                    salario 
     */
    public Employee(String name, String lastName, String identificationCart, Date dateOfBird, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.identificationCart = identificationCart;
        this.dateOfBird = dateOfBird;
        this.salary = salary;
        
    }

    /*
    La siguiente son getters y setters
    */
    
    
     public WorkingHour getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(WorkingHour workingHour) {
        this.workingHour = workingHour;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentificationCart() {
        return identificationCart;
    }

    public void setIdentificationCart(String identificationCart) {
        this.identificationCart = identificationCart;
    }

    public Date getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird(Date dateOfBird) {
        this.dateOfBird = dateOfBird;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}
