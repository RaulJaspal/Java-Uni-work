public abstract class Person	  	    		        	    		      	
{	  	    		        	    		      	
  private String surname;	  	    		        	    		      	
  private String firstname;	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
  public Person(String firstname, String surname)	  	    		        	    		      	
  {	  	    		        	    		      	
    this.firstname = firstname;	  	    		        	    		      	
    this.surname = surname;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setSurname(String surname)	  	    		        	    		      	
  {	  	    		        	    		      	
    this.surname = surname;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
   public void setFirstname(String firstname)	  	    		        	    		      	
  {	  	    		        	    		      	
    this.firstname = firstname;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getSurname()	  	    		        	    		      	
  {	  	    		        	    		      	
    return surname;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getFirstname()	  	    		        	    		      	
  {	  	    		        	    		      	
    return firstname;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String toString()	  	    		        	    		      	
  {	  	    		        	    		      	
    return (firstname +" "+ surname);	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
}