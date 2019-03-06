public class PastryItem extends Item {

    protected String flavor; 
    protected boolean isHeated;  
    protected final double HEATED = 0.25;

    public PastryItem() {
        flavor = " "; 
        cost = 0; 

    }

    public PastryItem(String flavor, String name, boolean heated) {
        this.flavor = flavor; 
        this.name = name;
        this.isHeated = heated; 
    }
    
    public double getCost

}