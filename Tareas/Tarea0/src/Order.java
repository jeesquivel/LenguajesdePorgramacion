
import java.util.ArrayList;


/**
 *
 * @author Jeison
 */
public class Order {
    private int orderNumber;                        // numero de orden                          
    private Client client;                          // cleinte
    private ArrayList<Aliment> aliments;            // alimentos de la orden
    private double totalCost;                       // costo total
    private int state;                              // estado de la orden
    
    public Order() {
    }

    /**
     * Contructor de la clase orden
     * @param orderNumber
     * @param client
     * @param state 
     */
    public Order(int orderNumber, Client client, int state) {
        this.orderNumber = orderNumber;
        this.client = client;
        this.state = state;
        aliments = new ArrayList<>();
    }
    
    
    /**
     * Adiere un alimento a la orden
     * @param pAliment 
     */
    public void addAliment(Aliment pAliment){
        aliments.add(pAliment);
        
    }
    
    /**
     * Remueve un alimento de la orden del cliente
     * @param pAliment 
     */
    public void deleteAliment(Aliment pAliment){
        aliments.remove(pAliment);
        setTotalCost( );
    }
    
    

 /*
    Lo siguiente son puros getter y setters
    */   
    
    
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getTotalCost() {
        setTotalCost();
        return totalCost;
    }

    public void setTotalCost() {
        for (Aliment i : aliments) {
            totalCost+=i.getPrice();
        }
    }
    
    public int getState() {
        return state;
    }

    public void changeState(int state) {
        this.state = state;
    }
    
    
    
    
    
    
   
   
}
