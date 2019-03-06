/**
 * The Item superclass that holds the basic methods for implementing 
 * products in a boba tea lounge 
 */
public abstract class Item {

    protected String name; 
    protected double cost; 
    
    /**
     * The constructor for the item class 
     */
    public Item() {
        name = ""; 
        cost = 0; 
    }
    /**
     * The overloaded constructor that sets the name and the cost
     * @param name The name of the item
     * @param cost The cost of the item
     */
    public Item(String name, double cost) {
        this.name = name; 
        this.cost = cost; 
    }
    /**
     * Sets the name of the item
     * @param name The name of the item
     */
    public void setName(String name) {
        this.name = name; 
    } 
    /**
     * Sets the cost of the item
     * @param price The price of the item
     */
    public void setCost(double price) {
        cost = price;
    }
    /**
     * Returns the name of the item 
     * @return name - the name of the item 
     */
    public String getName() {
        return name;    
    }
    /**
     * An abstract method that will return the cost 
     * of all the items
     * @return cost of all the items
     */
    public abstract double getCost();
}