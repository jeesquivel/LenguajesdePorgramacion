package domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Jeison on 06/03/2018.
 */
public class Student implements Serializable{
    private String idStudent;
    private String name;
    private String lastName;
    private Date dateBird;
    private String career;

    public Student(String idStudent, String name, String lastName, Date dateBird, String career) {
        this.idStudent = idStudent;
        this.name = name;
        this.lastName = lastName;
        this.dateBird = dateBird;
        this.career = career;
    }

    public Student() {
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
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

    public Date getDateBird() {
        return dateBird;
    }

    public void setDateBird(Date dateBird) {
        this.dateBird = dateBird;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
