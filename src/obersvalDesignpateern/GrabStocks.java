package obersvalDesignpateern;

public class GrabStocks {
	public static void main(String[] args){
	
		 StockGrabber stockGrabber = new StockGrabber(); 
		
		StockOberver observer1  = new StockOberver(stockGrabber);
		
		 stockGrabber.setIBMPrice(197.00); 
		 stockGrabber.setAAPLPrice(677.60); 
		 stockGrabber.setGOOGPrice(676.40);
		 StockOberver observer2  = new StockOberver(stockGrabber);
		 
		 stockGrabber.setIBMPrice(100.00); 
		 stockGrabber.setAAPLPrice(677.60); 
		 stockGrabber.setGOOGPrice(676.40);
	}

}
