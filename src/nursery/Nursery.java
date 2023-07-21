
package nursery;

import java.util.Scanner;

public class Nursery {
   
    public static void main(String[] args) {
         
        Scanner sn= new Scanner(System.in);
        Customer customer = new Customer();
        System.out.print("Enter Name : " );
        customer.name= sn.next();
        System.out.print("Enter Email Address : ");
        customer.email = sn.next();
        System.out.print("Enter City : ");
        customer.city = sn.next();
        System.out.print("Enter address of area : ");
        customer.address = sn.next();
        
        int deliveryCharge;
        double vat = 1 + 0.05;
        if(customer.city.equalsIgnoreCase("dhaka"))
        {
             deliveryCharge = 70;
        }
        else deliveryCharge = 130;
        
        System.out.println();
        System.out.println("===========================================================================================================");
        System.out.println("                                             Customer details                                              ");
        System.out.println("===========================================================================================================");
        System.out.println("Customer name    : " + customer.name );
        System.out.println("Customer Email   : " + customer.getEmail());
        System.out.println("Customer City    : " + customer.getCity());
        System.out.println("Customer Address : " + customer.getAddress());
        
        System.out.println();
        System.out.println("===========================================================================================================");
        System.out.println("                                              Plant Section                                                ");
        System.out.println("-----------------------------------------------------------------------------------------------------------");     
        Plant p1 = new Plant(1, "Rose cactus" , 90);
        Plant p2 = new Plant(2 ,"Orchid" ,  550);
        Plant p3 = new Plant(3 ,"Oporajita" , 70);
        Plant p4 = new Plant(4 ,"Black Rose" , 250);
        Plant p5 = new Plant(5 ,"Cactus" , 70);
        
        System.out.println("1. PlantID : " + p1.getPlantID()+ "    Plant Name : " + p1.getPlantName() +"    Price per plant : " + p1.getprice() + " BDT");
        System.out.println("2. PlantID : " + p2.getPlantID()+ "    Plant Name : " + p2.getPlantName() +"         Price per plant : " + p2.getprice() + " BDT");
        System.out.println("3. PlantID : " + p3.getPlantID()+ "    Plant Name : " + p3.getPlantName() +"      Price per plant : " + p3.getprice() + " BDT");
        System.out.println("4. PlantID : " + p4.getPlantID()+ "    Plant Name : " + p4.getPlantName() +"     Price per plant : " + p4.getprice() + " BDT");
        System.out.println("5. PlantID : " + p5.getPlantID()+ "    Plant Name : " + p5.getPlantName() +"         Price per plant : " + p5.getprice() + " BDT");
        System.out.println();
        
        System.out.println("How mamy types of plants do you want to buy???");
        int p = sn.nextInt();
        Plant plantArray[] = new Plant[p];
        int pid,pno;
        double totalPlantPrice = 0;
        
        for (int i=0 ; i<p ; i++)
        {
            System.out.print("Enter PlantID : ");
            pid=sn.nextInt();
            System.out.print("No of plant(s) : ");           
            pno=sn.nextInt();
            
            if (pid==1)  plantArray[i] = p1;
            if (pid==2)  plantArray[i] = p2;
            if (pid==3)  plantArray[i] = p3;
            if (pid==4)  plantArray[i] = p4;
            if (pid==5)  plantArray[i] = p5;
             
            double plantPrice =  (plantArray[i].getprice()*pno) ;
            totalPlantPrice += plantPrice;
            System.out.println("___________________________________________________________________________________________________________");
            System.out.println((i+1) + ". Plant ID : "+ pid  + " ,  Plant name: " + plantArray[i].getPlantName() +" , Number Of Plants: " + pno + " , Price: " + (plantArray[i].getprice() * pno) + " BDT");
            System.out.println("___________________________________________________________________________________________________________");
        }
        System.out.println();

        System.out.println("Total Price of Plant : " + totalPlantPrice + " ৳");
        System.out.println();
        
        System.out.println("===========================================================================================================");
        System.out.println("                                             Soil Section                                                  ");
        System.out.println("-----------------------------------------------------------------------------------------------------------");     
        Soil s1 = new Soil(1, 5.1 ,20, 45);
        Soil s2 = new Soil(2, 8.2 ,20, 50);
        Soil s3 = new Soil(3, 6.2 ,40, 65);
        Soil s4 = new Soil(4, 4.0 ,25, 40);
        Soil s5 = new Soil(5, 8.0 ,20, 38);        
        
        System.out.println("1. SoilID : " + s1.getSoilID()+ "    pH : " + s1.getpH() + "    Price per bag : " + s1.getprice() + " BDT");
        System.out.println("2. SoilID : " + s2.getSoilID()+ "    pH : " + s2.getpH() + "    Price per bag : " + s2.getprice() + " BDT");
        System.out.println("3. SoilID : " + s3.getSoilID()+ "    pH : " + s3.getpH() + "    Price per bag : " + s3.getprice() + " BDT");
        System.out.println("4. SoilID : " + s4.getSoilID()+ "    pH : " + s4.getpH() + "    Price per bag : " + s4.getprice() + " BDT");
        System.out.println("5. SoilID : " + s5.getSoilID()+ "    pH : " + s5.getpH() + "    Price per bag : " + s5.getprice() + " BDT");
        System.out.println();
        
        System.out.println("How mamy types of readymade Soil do you want to buy???");
        int s = sn.nextInt();
        Soil soilArray[] = new Soil[s];
        int sid;
        double sno;
        double totalSoilPrice = 0;
        
        for (int i=0 ; i<s ; i++)
        {
            System.out.print("Enter SoilID : ");
            sid=sn.nextInt();
                        
            System.out.print("No of Bag(s) : ");           
            sno=sn.nextDouble();
            
            if (sid==1)  soilArray[i] = s1;
            if (sid==2)  soilArray[i] = s2;
            if (sid==3)  soilArray[i] = s3;
            if (sid==4)  soilArray[i] = s4;
            if (sid==5)  soilArray[i] = s5;
                        
            double soilPrice =  (soilArray[i].getprice()*sno) ;
            totalSoilPrice += soilPrice;
            System.out.println("___________________________________________________________________________________________________________");
            System.out.println((i+1) + ". Soil ID : "+ sid  + " ,  pH : " + soilArray[i].getpH() +" , Number Of Bag(s): " + sno + " , Price: " + (soilArray[i].getprice()*sno) + " BDT");
            System.out.println("___________________________________________________________________________________________________________");
        } 
        System.out.println();
        System.out.println("Total Price of readymade Soil : " + totalSoilPrice + " BDT");
        System.out.println("___________________________________________________________________________________________________________");
        System.out.println();
        System.out.println("Do You want to mix soil??? If you want, press 1 . Else  press 0. ");
        int dcsn = sn.nextInt();
        
        if (dcsn==1)
        {
            Soil sl[] = new Soil[2];
            for (int i=0 ; i<2 ; i++)            
            {                
                System.out.print("Enter SoilID of Soil Type "+ (i+1) + " : ");
                sid=sn.nextInt();
                double noOfBags;
  
                System.out.print("Enter number of bag(s) of Soil Type "+ (i+1) + " : ");
                noOfBags = sn.nextDouble();
              
                if (sid==1)  sl[i] = s1;
                if (sid==2)  sl[i] = s2;
                if (sid==3)  sl[i] = s3;
                if (sid==4)  sl[i] = s4;
                if (sid==5)  sl[i] = s5;
                sl[i].setnoOfBags(noOfBags);                                                        
            }
            Soil mix = sl[0].mixSoil(sl[1]);
            System.out.println("___________________________________________________________________________________________________________");
            System.out.println("Mixed soil:");
            System.out.print("pH:" + mix.getpH() + " ");
            mix.testSoil();
            if (mix.getpH()> 5.5 && mix.getpH()< 7.0)
            {
                System.out.println("___________________________________________________________________________________________________________");
                System.out.println( "Mixed Soil ID : "+ sl[0].getSoilID() +" & "  + sl[1].getSoilID() + " ,  pH : " + mix.getpH() +" , Number Of Bag(s): " + mix.getnoOfBags() + " , Price: " + (mix.getprice()) + " BDT");
                System.out.println("___________________________________________________________________________________________________________");
            }
            System.out.println();
            System.out.println("Total Price of Soil : " + (totalSoilPrice + mix.getprice()) + " BDT");
            
        }
        
        else
        {
            System.out.println("No");
            System.out.println();
            System.out.println("___________________________________________________________________________________________________________");
            System.out.println("Total Price of Soil : " + (totalSoilPrice ) + " BDT");
        }    
        
        System.out.println("===========================================================================================================");
        System.out.println("                                              Pot Section                                                  ");
        System.out.println("-----------------------------------------------------------------------------------------------------------");     
        PlantPot pp1 = new PlantPot(1, "Clay Pot" , "Medium" , 35 );
        PlantPot pp2 = new PlantPot(2, "Plastic Pot" , "Medium" , 30 );
        PlantPot pp3 = new PlantPot(3, "Clay Pot" , "Small" , 20 );
        PlantPot pp4 = new PlantPot(4, "Plastic Pot" , "Large" , 45 );
        PlantPot pp5 = new PlantPot(5, "Ceramic Pot" , "Small" , 100 );
        
        System.out.println("1. PotID : " + pp1.getPotID()+ "    Material : " + pp1.getmaterial() + "       Size : " + pp1.getsize() + "    Price per Pot : " + pp1.getprice() + " BDT");
        System.out.println("2. PotID : " + pp2.getPotID()+ "    Material : " + pp2.getmaterial() + "    Size : " + pp2.getsize() + "    Price per Pot : " + pp2.getprice() + " BDT");
        System.out.println("3. PotID : " + pp3.getPotID()+ "    Material : " + pp3.getmaterial() + "       Size : " + pp3.getsize() + "     Price per Pot : " + pp3.getprice() + " BDT");
        System.out.println("4. PotID : " + pp4.getPotID()+ "    Material : " + pp4.getmaterial() + "    Size : " + pp4.getsize() + "     Price per Pot : " + pp4.getprice() + " BDT");
        System.out.println("5. PotID : " + pp5.getPotID()+ "    Material : " + pp5.getmaterial() + "    Size : " + pp5.getsize() + "     Price per Pot : " + pp5.getprice() + " BDT");
        System.out.println();
        
        System.out.println("How mamy types of pots do you want to buy???");
        int pp = sn.nextInt();
        PlantPot plantPotArray[] = new PlantPot[pp];
        int ppid,ppno;
        double totalPlantPotPrice = 0;
        
        for (int i=0 ; i<pp ; i++)
        {
            System.out.print("Enter PotID : ");
            ppid=sn.nextInt();
            System.out.print("No of pot(s) : ");           
            ppno=sn.nextInt();
            
            if (ppid==1)  plantPotArray[i] = pp1;
            if (ppid==2)  plantPotArray[i] = pp2;
            if (ppid==3)  plantPotArray[i] = pp3;
            if (ppid==4)  plantPotArray[i] = pp4;
            if (ppid==5)  plantPotArray[i] = pp5;
             
            double plantPotPrice =  (plantPotArray[i].getprice()*ppno) ;
            totalPlantPotPrice += plantPotPrice;
            System.out.println("___________________________________________________________________________________________________________");
            System.out.println((i+1) + ". Pot ID : "+ ppid  + " ,  Pot Material: " + plantPotArray[i].getmaterial() + " , Size : "+ plantPotArray[i].getsize()+" , Number Of Plants: " + ppno + " , Price: " + plantPotArray[i].getprice()* ppno + " BDT");
            System.out.println("___________________________________________________________________________________________________________");
        }
        
        System.out.println("Total Price of Pot : "  + totalPlantPotPrice + " BDT" );
        System.out.println("===========================================================================================================");
        System.out.println();
        System.out.println("Vat             : 5%");
        System.out.println("Delivery Charge : " + deliveryCharge + " BDT");
        double totalCost=( totalPlantPrice + totalSoilPrice+  totalPlantPotPrice )* vat;        
        System.out.println("Total Cost      : " + (Math.round(totalCost)+ deliveryCharge) + " BDT");
        System.out.println("===========================================================================================================");
        
        System.out.println();
        
        
    }
        
}
