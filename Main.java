public class Main	  	    		        	    		      	
{	  	    		        	    		      	
  public static void main(String[] args)	  	    		        	    		      	
  {	  	    		        	    		      	
    Room one = new Room();	  	    		        	    		      	
    one.setLength(3.0);	  	    		        	    		      	
    one.setLevel(5);	  	    		        	    		      	
    one.setWidth(6.0);	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
    Room two = new Room();	  	    		        	    		      	
    two.setLength(4.0);	  	    		        	    		      	
    two.setLevel(5);	  	    		        	    		      	
    two.setWidth(6.0);	  	    		        	    		      	
	  	    		        	    		      	
    Room[] arr = {one,two};	  	    		        	    		      	
	  	    		        	    		      	
    Building mai = new Building();	  	    		        	    		      	
    mai.setRooms(arr);	  	    		        	    		      	
    System.out.println(mai.getTotalFloorSpace());	  	    		        	    		      	
  }	  	    		        	    		      	
}