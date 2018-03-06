
/**
 *
 * @author Jeison
 */
public class Client extends Person{
    
    private Order order;                                                        // orden del cliente

    /**
     *  Constructor de la clase Client
     * @param name nombre
     * @param lastName apellido
     * @param home direccion
     * @param identificationNumber  cedula
     */
    public Client(String name, String lastName, String home,
            int identificationNumber) {
        super(name, lastName, home, identificationNumber);
        this.order = order;
    }
    
    /**
     * Constructor
     */
    public Client(){
        super();
    }
    
    /**
     * Elimina la orden de un cleinte
     */
    public void deleteOrder(){
        order=null;
    }
    
    /**
     * Consulta el precio a pagar por una orden
     * @return 
     */
    public double checkPrice(){
        return order.getTotalCost();
    }
   
    /**
     * permite pagar la orden y cambiar el estado a pagado
     */
    public void payOrder(){
        order.changeState(1);
    }

    /**
     * Asiga una orden al cliente
     * @param order 
     */
    public void setOrder(Order order) {
        this.order = order;
    }
    
    /**
     * Adiere un alimento a la orden del cliente
     * @param pAliment 
     */
    public void addAliment(Aliment pAliment){
        order.addAliment(pAliment);
    }
    /**
     * Remueve un alimento no deseado de la orden del cleinte
     * @param pAliment 
     */
    public void removeAliment(Aliment pAliment){
        order.deleteAliment(pAliment);
    }
    
}
