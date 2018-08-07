package gasStation;


/**
* <p>Title: GasStation</p>
*
* <p>
*
* <p>
* </p>.
*.
* @author Naresh KC
*/

public class GasStation {
	private double regularprice;  // price for a gallon of regular
	private double superprice;    // price for a gallon of super
	private	 double sales;         // total sales of station in dollars
	private double gasToSale = 1000;
	//private double supplyGas;

		 
			public  GasStation(double r, double s)
			  {  regularprice = r;  superprice = s; sales = 0; }

			  
			// methods to sell gas, parameter indicates number of gallons
			  void sellregular(double gallons)
			  {
				  if(gasToSale <200 )
				  {gouge();}
				  else {
			    sales =+regularprice * gallons; 
			    gasToSale = gasToSale - gallons; }
			   
			  }

			  void sellsuper(double gallons)
			  {
				  if(gasToSale < 200)
				  { gouge(); }
				  else {
			    sales =+superprice * gallons;
			    gasToSale = gasToSale - gallons; }
			  
			  }

			  // an accessor method
			  double getsales()
			  { 
				  return sales; 
			  }
			  
			
			  
			  // method to compare the total sales of one station versus another
			  boolean moreprofit(GasStation  other)
			  {
			    return sales > other.sales;
			  }

	
			  //  method to double prices - can only call internally
			  void gouge() { superprice *= 2; regularprice *= 2; }
			  
			  double currentSupply() 
			  { return gasToSale; }
			  
			  void PrintCurrentSupply() 
			  {  System.out.println( "Current supply of gas is " + currentSupply()); }


			  public static void main(String[] args)
			{
			  GasStation A = new GasStation(2.29, 2.49);
			  GasStation B = new GasStation(2.09, 2.19);

			  A.sellregular(10);  A.sellsuper(8);
			  B.sellsuper(11);    B.sellregular(12);

			  if (A.moreprofit(B))
				  System.out.println( "station A is more profitable\n");
			    else 
			    	System.out.println("station B is more profitable\n");
			  
			
			  GasStation[] G = new GasStation[10];
			  for(int i=0;i<10;i++)
				  {
				  G[i] = new GasStation(2.19,2.39);
				  
				  }
			  GasStation highest = G[0];
			  
			  
			  //loop to find out the gas station with highest sales value
			  for(int i=0;i<10;i++)
				  {if(G[i].moreprofit(highest))
				  highest = G[i];
				
				  
				  }
			 
			 
			  G[1].sellregular(30);
			  G[1].sellsuper(35);
			  System.out.println("Current supply of A is " + A.currentSupply());
			  System.out.println("Total sales of GasStation A is  " + A.getsales());
			  System.out.println("highest total sales is " + highest.getsales());
			  System.out.println("Current supply of B is " + B.currentSupply());
			  System.out.println("Total sales of GasStation B is  " + B.getsales());
			 
  } }
