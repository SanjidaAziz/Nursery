
package nursery;

public class Soil {
    private double pH;
    private double noOfBags;
    private double price;
    private int soilID;
    
    public Soil()
    {
        
    }
    
    public Soil(double pH)
    {
        this.pH=pH;
    }

    public Soil(int soilID ,double noOfBags){
      this.soilID=soilID;
      this.noOfBags=noOfBags;
    }
    public Soil(int soilID , double pH, double noOfBags, double price)
    {
        this.pH=pH;
        this.soilID=soilID;
        this.price=price;
        this.noOfBags=noOfBags;
    }
    
    public Soil(int soilID , double pH, double price)
    {
        this.pH=pH;
        this.soilID=soilID;
        this.price=price;
        
    }
    
    public double getpH()
    {
        return pH;
    }
    
    public void setpH(double pH)
    {
        this.pH=pH;
    }
     public double getnoOfBags()
    {
        return noOfBags;
    }
    
    public void setnoOfBags(double noOfBags)
    {
        this.noOfBags=noOfBags;
    }
    public double getprice()
    {
        return price;
    }
    
    public void setprice(double price)
    {
        this.price=price;
    }
    
    public void setSoilID(int soilID)
    {
        this.soilID= soilID;
    }
    
    public int getSoilID()
    {
        return soilID;
    }
    
    public Soil mixSoil(Soil soilType2)
    {
        Soil mixedSoil=new Soil();
        
        mixedSoil.noOfBags = (this.noOfBags + soilType2.noOfBags) ;
        mixedSoil.pH = (this.pH * this.noOfBags + soilType2.pH * soilType2.noOfBags)/mixedSoil.noOfBags ;
        mixedSoil.price = (5*mixedSoil.noOfBags) +( this.price* this.noOfBags + soilType2.price * soilType2.noOfBags) ;
                
                
        return mixedSoil;         
    }
    
    public void testSoil()
    {
        if (this.pH < 5.5 ) System.out.println("(pH of this soil is not good for plants!!! Add more base!!!)");
        else if(this.pH > 7.0) System.out.println("(pH of this soil is not good for plants.Add more acidic soil!!!)");
        else System.out.println("(pH of this soil is perfect for plants...)");
    }
    
    public double calculatePrice()
    {
        double calculatePrice = this.noOfBags * this.price;
        return calculatePrice;
    }
        
    
}
