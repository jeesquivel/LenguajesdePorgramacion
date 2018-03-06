/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.Instant;
import java.util.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Jeison
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
      
    }

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("la casa de chino", "a un costado del TEC");         // se crea un restaurante                       
        Client cliente1= new Client("Jeison", "Esquivel", "cerca del tec", 1234);                   // se crea un cleinte
        Client client2= new Client("Milena", "mier", "al final del bar Royal", 4321);               // se crea un segundo cleinte
        
        Aliment alimento1= new Aliment("gallo pinto", "arroz y frijoles", 2500);                    // se crea un alimento
        Aliment alimento2= new Aliment("casado", "montonde cosas", 3500);                           // se crea un alimento
        Aliment alimento3= new Aliment("Cafe", "cafe con leche", 1000);                             // se crea un alimento
        Aliment alimento4= new Aliment("agua", "agua fria", 500);                                   // se crea un alimento
        
        Order orden1= new Order(1, cliente1, 0);                                                    // se crea una orden
        cliente1.setOrder(orden1);                                                                  // se concatena la orden con le cliente                                 
        orden1.addAliment(alimento1);                                                               // se annae un alimento a la orden
        orden1.addAliment(alimento3);                                                               // se annae un alimento a la orden

       
        System.out.println( cliente1.checkPrice());                                                 // se calcula el precio a pagar

        
        
                
    }
    
}
