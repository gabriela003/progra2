package observer;

public class inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	        Journalist journalist = new Journalist();
	        journalist.addObserver(new Newspaper());
	        journalist.addObserver(new Tv());
	        journalist.addObserver(new Online());
	        journalist.publish("Birds going extinct", 
	                "Summary: Research from the university of ...", 
	                "Image of Birds", 
	                "The number of birds are going down ...");
		
	}

}
