import java.util.ArrayList;	  	    		        	    		      	
	  	    		        	    		      	
public class Drawer	  	    		        	    		      	
{	  	    		        	    		      	
	  	    		        	    		      	
    private ArrayList<Sock> socks = new ArrayList<>();	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
    public Sock getSock(int sockno)	  	    		        	    		      	
    {	  	    		        	    		      	
        if (sockno < 1 || sockno > socks.size()) return null;	  	    		        	    		      	
        return socks.get(sockno - 1);	  	    		        	    		      	
    }	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
    public void addSock(Sock newsock)	  	    		        	    		      	
    {	  	    		        	    		      	
        socks.add(newsock);	  	    		        	    		      	
    }	  	    		        	    		      	
	  	    		        	    		      	
	  	    		        	    		      	
    public boolean hasPair()	  	    		        	    		      	
    {	  	    		        	    		      	
	  	    		        	    		      	
        for (int i = 0; i < socks.size(); i++)	  	    		        	    		      	
        {	  	    		        	    		      	
            for (int j = i + 1; j < socks.size(); j++)	  	    		        	    		      	
            {	  	    		        	    		      	
                if (socks.get(i).isPair(socks.get(j))) return true;	  	    		        	    		      	
            }	  	    		        	    		      	
        }	  	    		        	    		      	
        return false;	  	    		        	    		      	
    }	  	    		        	    		      	
}