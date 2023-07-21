
package nursery;

public class Customer {
    public  String name;
    public  String email;
    public  String city;
    public  String address;
    
    public Customer()
    {
        
    }
    
    public Customer(String name, String email, String city , String address)
    {
        this.name=name;
        this.email=email;
        this.address=address;
        this.city=city;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email =email;
    }
    
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address =address;
    }
    
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city =city;
    }
    
}
