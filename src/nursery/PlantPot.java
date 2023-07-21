
package nursery;

public class PlantPot {
    private String material;
    private String size;
    private double price;
    private int noOfPots;
    private int potID;
    
    public PlantPot()
    {
        
    }
    public PlantPot(String material , String size , double price, int noOfPots)
    {
        this.material=material;
        this.size=size;
        this.price=price;
        this.noOfPots=noOfPots;
    }
    public PlantPot(int potID , String material , String size , double price)
    {
        this.material=material;
        this.size=size;
        this.price=price;
        this.potID=potID;
    }
    public PlantPot(int potID , int noOfPots)
    {
        this.potID=potID;
        this.noOfPots=noOfPots;
    }
    
    public String getmaterial()
    {
        return material;
    }
    public void setmaterial(String material)
    {
        this.material=material;
    }
    
    public String getsize()
    {
        return size;
    }
    public void setsize(String size)
    {
        this.size=size;
    }
    
    public double getprice()
    {
        return price;
    }
    public void setprice(double price)
    {
        this.price=price;
    }
    
    public int getnoOfPots()
    {
        return noOfPots;
    }
    public void setnoOfPots(int noOfPots)
    {
        this.noOfPots=noOfPots;
    }
    
    public void setPtID(int potID)
    {
        this.potID=potID;
    }
    
    public int getPotID()
    {
        return potID;
    }
    
    public double calculatePrice()
    {
        double calculatePrice = this.noOfPots * this.price;
        return calculatePrice;
    }
    
}
