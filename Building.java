public class Building	  	    		        	    		      	
{	  	    		        	    		      	
  private int streetNumber;	  	    		        	    		      	
  private String streetName;	  	    		        	    		      	
  private String postCode;	  	    		        	    		      	
  private String ownerName;	  	    		        	    		      	
	  	    		        	    		      	
  private Room[] rooms;	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
  public void setStreetNumber(int streetNumber)	  	    		        	    		      	
  {	  	    		        	    		      	
     this.streetNumber = streetNumber;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public int getStreetNumber()	  	    		        	    		      	
  {	  	    		        	    		      	
     return this.streetNumber;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setStreetName(String streetName)	  	    		        	    		      	
  {	  	    		        	    		      	
     this.streetName = streetName;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getStreetName()	  	    		        	    		      	
  {	  	    		        	    		      	
     return this.streetName;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setPostCode(String postCode)	  	    		        	    		      	
  {	  	    		        	    		      	
     this.postCode = postCode;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getPostCode()	  	    		        	    		      	
  {	  	    		        	    		      	
     return this.postCode;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setOwnerName(String ownerName)	  	    		        	    		      	
  {	  	    		        	    		      	
     this.ownerName = ownerName;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getOwnerName()	  	    		        	    		      	
  {	  	    		        	    		      	
     return this.ownerName;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setRooms(Room[] rooms)	  	    		        	    		      	
  {	  	    		        	    		      	
    this.rooms = rooms;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public Room[] getRooms()	  	    		        	    		      	
  {	  	    		        	    		      	
    return rooms;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
  public double getTotalFloorSpace()	  	    		        	    		      	
  {	  	    		        	    		      	
    double total = 0;	  	    		        	    		      	
    for (int i = 0; i<rooms.length;i++)	  	    		        	    		      	
    {	  	    		        	    		      	
      total = total+rooms[i].getFloorSpace();	  	    		        	    		      	
    }	  	    		        	    		      	
    return total;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
}