
package nursery;


public class Plant {
    private String plantName;
    private int noOfPlants;
    private double price;
    private int plantID;
    
    public Plant(){
        
    }
    
    public Plant(int plantID){
      this.plantID=plantID;
    }
    public Plant(int plantID ,int noOfPlants){
      this.plantID=plantID;
      this.noOfPlants=noOfPlants;
    }
    public Plant(int plantID , String plantName, double price)
    {
        this.plantName=plantName;
        this.plantID=plantID;
        this.price=price;
    }
    
    public Plant(int plantID , String plantName,int noOfPlants, double price)
    {
        this.plantName=plantName;
        this.plantID=plantID;
        this.price=price;
        this.noOfPlants=noOfPlants;
    }
    
    public String getPlantName()
    {
        return plantName;
    }
    public void setPlantName(String plantName)
    {
        this.plantName = plantName;
    }
    
    public int getnoOfPlants()
    {
        return noOfPlants;
    }
    public void setPlantID(int plantID)
    {
        this.plantID=plantID;
    }
    
    public int getPlantID()
    {
        return plantID;
    }
    public void setnoOfPlants(int noOfPlants)
    {
        this.noOfPlants=noOfPlants;
    }
    public double getprice()
    {
        return price;
    }
    public void setprice(double price)
    {
        this.price=price;
    }
    
    public double calculatePrice()
    {
        double calculatePrice = this.noOfPlants * this.price;
        return calculatePrice;
    }
    
}
