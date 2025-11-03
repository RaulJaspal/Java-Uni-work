public class Film	  	    		        	    		      	
{	  	    		        	    		      	
  private String title;	  	    		        	    		      	
  private String director;	  	    		        	    		      	
  private int length;	  	    		        	    		      	
  private static int totalLength;	  	    		        	    		      	
	  	    		        	    		      	
  public Film()	  	    		        	    		      	
  {	  	    		        	    		      	
    director = "Unknown";	  	    		        	    		      	
    title = "Unknown";	  	    		        	    		      	
    length = 0;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public Film(String director, String title, int length)	  	    		        	    		      	
  {	  	    		        	    		      	
    this.title = title;	  	    		        	    		      	
    this.director = director;	  	    		        	    		      	
    if(length >=0)	  	    		        	    		      	
    {	  	    		        	    		      	
    this.length = length;	  	    		        	    		      	
     totalLength = totalLength + length;	  	    		        	    		      	
    }	  	    		        	    		      	
    length = 0;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getTitle()	  	    		        	    		      	
  {	  	    		        	    		      	
    return title;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setTitle(String title)	  	    		        	    		      	
  {	  	    		        	    		      	
    this.title = title;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getDirector()	  	    		        	    		      	
  {	  	    		        	    		      	
    return director;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setDirector(String director)	  	    		        	    		      	
  {	  	    		        	    		      	
    this.director = director;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public int getLength()	  	    		        	    		      	
  {	  	    		        	    		      	
    return length;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setLength(int length)	  	    		        	    		      	
  {	  	    		        	    		      	
    if(length >=0)	  	    		        	    		      	
    {	  	    		        	    		      	
    this.length = length;	  	    		        	    		      	
     totalLength = totalLength+length;	  	    		        	    		      	
    }	  	    		        	    		      	
    else{	  	    		        	    		      	
    length = length;	  	    		        	    		      	
    }	  	    		        	    		      	
	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public static int getTotalLength()	  	    		        	    		      	
  {	  	    		        	    		      	
    return totalLength;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
}