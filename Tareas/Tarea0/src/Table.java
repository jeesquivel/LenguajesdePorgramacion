
/**
 *
 * @author Jeison
 */
class Table {
    
    private int numberTable;            // numero de mesa
    private int capacity;               // capacidad de personas en esa mesa

    /**
     * Constructor
     */
    public Table() {
    }
    
    /**
     * Sobrecarga del cosntructor
     * @param numberTable
     * @param capacity 
     */
    public Table(int numberTable, int capacity) {
        this.numberTable = numberTable;
        this.capacity = capacity;
    }

/*
    Lo siguiente son puros getters and setters
    */
    public int getNumberTable() {
        return numberTable;
    }

    public void setNumberTable(int numberTable) {
        this.numberTable = numberTable;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
    
}
