/**
 The Drink Item class is a subclass of the Item class
 *it will have the methods that tailored specifically to
 *drinks 
 */
public class DrinkItem extends Item {

    protected String size; 
    protected String flavor; 
    protected String sweetness; 
    protected String milk; 
    private double MUNEH;
    /**
     * The constructor for the DrinkItem class
     */
    public DrinkItem() {
        size = " ";
        flavor = " ";
        sweetness = " ";
        milk = " "; 
        MUNEH = 0; 
    }
    /**
     * The overloaded constructor for the DrinkItem class 
     * @param size The size of the product
     * @param flavor The flavor of the product
     * @param sweetness The amount of sweetness in the product
     * @param milk The type of milk that the user wants 
     */
    public DrinkItem(String size, String flavor, String sweetness, String milk) {
        this.size = size;
        this.flavor = flavor;
        this.sweetness = sweetness;
        this.milk = milk;
    }
    /**
     * Sets the flavor of the drink
     * @param flavor The flavor of the drink
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    /**
     * Sets the size of the drink
     * @param size The size of the drink 
     */
    public void setSize(String size) {
        this.size = size; 
    }
    /**
     * Sets the sweetness of the drink
     * @param sweetness A string that sets the sweetness of the drink
     */
    public void setSweetness(String sweetness) {
        this.sweetness = sweetness; 
    }
    /**
     * Sets the type of milk for the drink
     * @param milk The type of milk is passed through the method
     */
    public void setMilk(String milk) {
        this.milk = milk; 
    }
    /**
     * Returns the flavor of the drink
     * @return flavor - the flavor of the drink 
     */
    public String getFlavor() {
        return flavor; 
    }
    /**
     * Returns the size of the drink
     * @return size - the size of the drink
     */
    public String getSize() {
        return size; 
    }
    /**
     * Returns the sweetness of the drink 
     * @return sweetness - the sweetness of the drink 
     */
    public String getSweetness() {
        return sweetness; 
    }
    /**
     * Returns the milk added into the drink
     * @return milk - The type of milk that is added into the drink
     */
    public String getMilk() {
        return milk; 
    }
    /**
     * Returns the cost of the item 
     * @return MUNEH - the cost of the drink 
     */
    public double getCost() {
        return MUNEH; 
    }
}