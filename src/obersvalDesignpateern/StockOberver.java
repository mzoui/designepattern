package obersvalDesignpateern;

public class StockOberver  implements Observer{
	private double ibmPrice; 
	private double aaplPrice; 
	private double googPrice;
	private static int observerIDTracker = 0;
	private int observerID;
    private Subject stockGrabber;

	 public StockOberver(Subject stockGrabber){
		 
		         // I can make calls to its methods
		 
		         this.stockGrabber = stockGrabber;
		 
		         // Assign an observer ID and increment the static counter
		 
		         this.observerID = ++observerIDTracker;
		  
		         // Message notifies user of new observer
		 
		         System.out.println("New Observer " + this.observerID);
		 
		         // Add the observer to the Subjects ArrayList
		 
		         stockGrabber.register(this);
		  
		     }



	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		 this.ibmPrice = ibmPrice;
	      this.aaplPrice = aaplPrice;
		    this.googPrice = googPrice;
		    printThePrices();

		
	}
	
	public void printThePrices() {

		System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
                            aaplPrice + "\nGOOG: " + googPrice + "\n");

	}

}
