import java.util.ArrayList;	  	    		        	    		      	
public class Phone	  	    		        	    		      	
{	  	    		        	    		      	
  // well you'll have quite a bit to do in here :-)	  	    		        	    		      	
  private String brand;	  	    		        	    		      	
  private String type;	  	    		        	    		      	
  private String model;	  	    		        	    		      	
  private String uniqueID;	  	    		        	    		      	
  private int manufacturingCost;	  	    		        	    		      	
	  	    		        	    		      	
  private static int amount;	  	    		        	    		      	
  private static ArrayList<Phone> phone = new ArrayList<>();	  	    		        	    		      	
	  	    		        	    		      	
  public Phone(String brand, String type, String model, String uniqueID, int manufacturingCost)	  	    		        	    		      	
  {	  	    		        	    		      	
	  	    		        	    		      	
    this.brand = brand;	  	    		        	    		      	
    this.type = type;	  	    		        	    		      	
    this.model = model;	  	    		        	    		      	
    this.uniqueID = uniqueID;	  	    		        	    		      	
    this.manufacturingCost = manufacturingCost;	  	    		        	    		      	
	  	    		        	    		      	
    amount +=this.manufacturingCost;	  	    		        	    		      	
    phone.add(this);	  	    		        	    		      	
	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public static int getCostOfRun()	  	    		        	    		      	
  {	  	    		        	    		      	
    return amount;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public static ArrayList<Phone> getCurrentRun()	  	    		        	    		      	
  {	  	    		        	    		      	
    return phone;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public static void startNewRun()	  	    		        	    		      	
  {	  	    		        	    		      	
    amount = 0;	  	    		        	    		      	
    phone = new ArrayList<>();	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
  public void setBrand(String brand)	  	    		        	    		      	
  {	  	    		        	    		      	
     this.brand = brand;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getBrand()	  	    		        	    		      	
  {	  	    		        	    		      	
     return this.brand;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setType(String type)	  	    		        	    		      	
  {	  	    		        	    		      	
     this.type = type;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getType()	  	    		        	    		      	
  {	  	    		        	    		      	
     return this.type;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setModel(String model)	  	    		        	    		      	
  {	  	    		        	    		      	
     this.model = model;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getModel()	  	    		        	    		      	
  {	  	    		        	    		      	
     return this.model;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setUniqueID(String uniqueID)	  	    		        	    		      	
  {	  	    		        	    		      	
     this.uniqueID = uniqueID;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getUniqueID()	  	    		        	    		      	
  {	  	    		        	    		      	
     return this.uniqueID;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setManufacturingCost(int manufacturingCost)	  	    		        	    		      	
  {	  	    		        	    		      	
     this.manufacturingCost = manufacturingCost;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public int getManufacturingCost()	  	    		        	    		      	
  {	  	    		        	    		      	
     return this.manufacturingCost;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  @Override	  	    		        	    		      	
  public String toString()	  	    		        	    		      	
  {	  	    		        	    		      	
    return brand+" "+ type+ " " +model +" " +"("+uniqueID+")"+" "+"@ "+manufacturingCost;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
}