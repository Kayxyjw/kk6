package homework;
class C4 {
	  int speed;
	  double regularPrice;
	  String color; 
	  private void sysout() {
		// TODO Auto-generated method stub

	}

	  
	  
	  
	  public  C4(int speed, double regularPrice, String color) {
	        this.speed = speed;
	        this.regularPrice = regularPrice;
	        this.color = color;
	        
	    }
	  public C4() {
	  
	  }
	  public double saleprice() {
	    
	    return regularPrice;
	  }
	  
	  
	  

	}



	class Truck extends C4 {
	    int weight;

	    public  Truck(int speed, double regularPrice, String color, int weight) {
	        super(speed, regularPrice, color);

	        this.weight = weight;
	    }

	    
	    public  double saleprice() {
	        if (weight > 2000) {
	            return regularPrice * 0.9; 
	        } else {
	            return regularPrice * 0.8; 
	        }
	    }
	}



	class Ford extends C4{
	  int year;
	  int discount;
	  int weight;
	  public Ford(int speed, double regularPrice, String color,int year,int discount)  {
	    super (speed, regularPrice, color);

	   int discount1=123;
	    

	    this.year=year;
	    this.discount=discount1;
	  }
	  public double saleprice() {
	    return super.saleprice()-discount;
	  }
	  

	}
	class Sedan extends Ford{
	  int length;
	  int feet;  


	  public Sedan(int speed, double regularPrice, String color,int length,int feet) {
	       super(speed,regularPrice,color,length,feet);
	    this.length=length;
	  
	  }
	  public double saleprice() {
	      if (length > feet) {
	              return regularPrice * 0.95; 
	          } else {
	              return regularPrice * 0.9;
	          }
	  }
	  
	  
	  
	}
	public class car{
	  public static void main(String [] args) {
	        C4 car = new C4(120, 20000, "Red");
	      
	          Truck truck = new Truck(100, 30000, "Blue", 2500);
	          Ford ford = new Ford(150, 25000, "Black", 2022, 2000);
	          Sedan sedan4= new Sedan(130, 22000, "White", 22,20);

	          System.out.println("Car Sale Price: " + car.saleprice());
	          System.out.println("Truck Sale Price: " + truck.saleprice());
	          System.out.println("Ford Sale Price: " + ford.saleprice());
	          System.out.println("Sedan Sale Price: " + sedan4.saleprice());
	}
	 }
