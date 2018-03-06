
import java.util.Date;


/**
 *
 * @author Jeison
 */
public class Employee extends  Person{                   // herencia
    
    private int idEmployee;                             // id de empleado
    private double salary;                              // salario del empleado
    private Date dateHire;                              // fecha de contratacion
    private  double yearsExperience;                    // annos de experiencia
    
/**
 * Constructor de la clase Empelado
 * @param idEmployee                id de empleado
 * @param dateHire                  fecha de contratacion
 * @param yearsExperience           annos de experiencia
 * @param name                      nombre
 * @param lastName                  apellido
 * @param home                      domicilio
 * @param identificationNumber      cedula
 */
    public Employee(int idEmployee, double salary, Date dateHire, 
            double yearsExperience, String name, String lastName,
            String home, int identificationNumber) {
        super(name, lastName, home, identificationNumber);
        this.idEmployee = idEmployee;
        this.dateHire = dateHire;
        this.yearsExperience = yearsExperience;
    }

    public Employee() {
    }

    public int getIdEmployee() {
        return idEmployee;
    }
 
    /**
     * obtiene el salario de un cleinte
     * @return 
     */
    public double getSalary() {
        return salary;
    }

    /**
     * asigna salario de un cleinte
     * @param salary 
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /** Obtiene la fecha de contratacion de un empleado
     * @return 
     */
    public Date getDateHire() {
        return dateHire;
    }

    /**
     * Obtiene los annos de experiencia de un empleado
     * @return 
     */
    public double getYearsExperience() {
        return yearsExperience;
    }
    
}
