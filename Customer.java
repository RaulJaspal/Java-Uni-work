public class Customer	  	    		        	    		      	
{	  	    		        	    		      	
  // implement your code here	  	    		        	    		      	
	  	    		        	    		      	
  private String familyName;	  	    		        	    		      	
  private String[] givenName;	  	    		        	    		      	
  private String[] adressLine;	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
  public Customer(String name, String adress)	  	    		        	    		      	
  {	  	    		        	    		      	
    String [] name_split = name.trim().split(" ");	  	    		        	    		      	
    String[] adress_split = adress.trim().split(",");	  	    		        	    		      	
	  	    		        	    		      	
    familyName = name_split[name_split.length-1];	  	    		        	    		      	
	  	    		        	    		      	
    givenName = new String[name_split.length-1];	  	    		        	    		      	
	  	    		        	    		      	
    for(int i=0;i<name_split.length-1;i++)	  	    		        	    		      	
    {	  	    		        	    		      	
      givenName[i] = name_split[i]; //or do i do givenName[i] = ...	  	    		        	    		      	
    }	  	    		        	    		      	
	  	    		        	    		      	
    adressLine = new String[adress_split.length];	  	    		        	    		      	
    for (int i = 0; i<adress_split.length;i++)	  	    		        	    		      	
    {	  	    		        	    		      	
      adressLine[i] = adress_split[i];	  	    		        	    		      	
    }	  	    		        	    		      	
	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getFamilyName()	  	    		        	    		      	
  {	  	    		        	    		      	
    return familyName;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String[] givenNames()	  	    		        	    		      	
  {	  	    		        	    		      	
    return givenName;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getGivenName(int i)	  	    		        	    		      	
  {	  	    		        	    		      	
    return givenName[i-1];	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String[] getAdressLines()	  	    		        	    		      	
  {	  	    		        	    		      	
    return adressLine;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getAddressLine(int x)	  	    		        	    		      	
  {	  	    		        	    		      	
    return adressLine[x-1];	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
}