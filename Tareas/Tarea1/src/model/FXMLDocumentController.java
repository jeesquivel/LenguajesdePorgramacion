/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.*;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javafx.scene.control.TextField;

/** 
 */
public class FXMLDocumentController implements Initializable {
    Archive archivo;
    ArrayList<Headquarter> sedes= new ArrayList<>();
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Vehicle> vehicles= new ArrayList<>();

    
    
    @FXML
    private JFXTimePicker timeEntry,timeExit;
    @FXML
    private TextField nameEntry,lastNameEntry,identificationEntry,salaryEntry;
    @FXML
    private JFXDatePicker dateBird;
    
    /*
    Para los vehiculos
    */
    
    @FXML
    private TextField idVehicleEntry,modelEntry,colorEntry,yearEntry,maxVelocityEntry,mileageEntry;
    
    
    
 
    
    @FXML
    private void writeArchivePerson(ActionEvent event) throws IOException{
        Format  formatter = new SimpleDateFormat("dd/MM/yy");
        String name=nameEntry.getText();
        String lastName=lastNameEntry.getText();
        String idNumber=identificationEntry.getText();
        Date dateBird = new Date(this.dateBird.getEditor().getText());
        double salary= Double.parseDouble(salaryEntry.getText());
        String timeEntry=this.timeEntry.getEditor().getText();
        String timeExit=this.timeExit.getEditor().getText();
        
        Employee newEmployee= new  Employee(name, lastName, idNumber, dateBird, salary);
        WorkingHour workingHour= new WorkingHour(timeEntry, timeExit);
        newEmployee.setWorkingHour(workingHour);
        employees.add(newEmployee);
        
        String string= name+";"+lastName+";"+idNumber+";"+formatter.format(dateBird)+";"+
                       salary+";"+timeEntry+";"+timeExit+"\n";
        archivo.writeArchive(string,"Person.txt");
    }
    
    @FXML
    private void writeArchiveVehicles(ActionEvent event) throws IOException{
        String idVehicle= idVehicleEntry.getText();
        String model= modelEntry.getText();
        String color= colorEntry.getText();
        int maxVelocity= Integer.parseInt(maxVelocityEntry.getText());
        int year= Integer.parseInt(yearEntry.getText());
        double mileage=Double.parseDouble(mileageEntry.getText());
        Vehicle vehicle = new Vehicle(idVehicle, model, color, maxVelocity, year);
        
        String string=idVehicle+";"+ model+";"+color+";"+maxVelocity+";"+year
                +";"+mileage+";"+0+"\n";
        
        archivo.writeArchive(string,"Vehicles.txt");
        vehicles.add(vehicle);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        archivo= new Archive();
        // TODO
    }    
    
}
