import java.util.List;	  	    		        	    		      	
import java.util.ArrayList;	  	    		        	    		      	
public class Cinema	  	    		        	    		      	
{	  	    		        	    		      	
  private String name;	  	    		        	    		      	
  private List<Film> films;	  	    		        	    		      	
  private static int totalFilms;	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
  public Cinema()	  	    		        	    		      	
  {	  	    		        	    		      	
    name = "MyCinema";	  	    		        	    		      	
    films = new ArrayList<>();	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public Cinema(String name)	  	    		        	    		      	
  {	  	    		        	    		      	
    this.name = name;	  	    		        	    		      	
    films = new ArrayList<>();	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public String getName()	  	    		        	    		      	
  {	  	    		        	    		      	
    return name;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setName(String name)	  	    		        	    		      	
  {	  	    		        	    		      	
    this.name = name;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public List<Film> getFilms()	  	    		        	    		      	
  {	  	    		        	    		      	
    return films;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public void setFilms(List<Film> films)	  	    		        	    		      	
  {	  	    		        	    		      	
    this.films = films;	  	    		        	    		      	
    totalFilms ++;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public int totalFilms()	  	    		        	    		      	
  {	  	    		        	    		      	
    return totalFilms;	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
  public int totalLength()	  	    		        	    		      	
  {	  	    		        	    		      	
    return Film.getTotalLength();	  	    		        	    		      	
  }	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
}