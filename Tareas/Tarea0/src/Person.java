/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeison
 */
class Person {
    
    private String name;                    // nombde de la persona
    private String lastName;                // apellido de la persona
    private String home;                    // domicilio de la persona
    private int identificationNumber;       // numero de identificacion

    /**
     * Constructor de la clase Person
     * @param name
     * @param lastName
     * @param home
     * @param identificationNumber 
     */
    public Person(String name, String lastName, String home, int identificationNumber) {
        this.name = name;
        this.lastName = lastName;
        this.home = home;
        this.identificationNumber = identificationNumber;
    }

    public Person() {
    }

  /*
     Lo soguiente son puros getters and setters
    */  
    
    
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

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
    

    
}
