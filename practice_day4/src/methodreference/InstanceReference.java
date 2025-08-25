package methodreference;

public class InstanceReference {

	public static void main(String[] args)
	  {
	        	
		     
		
	  }

}


class car
{
   int id;
   String name;
   double price;
   
   public car(int id,String name,double price)
   {
	   this.id=id;
	   this.name=name;
	   this.price=price;
   }
   
   public boolean checkprice()
   {
	   if(this.price>100.0)
	   {
		   return true;
	   }
	   return false;
   }

     @Override
     public String toString() 
     {
	   return "car [id=" + id + ", name=" + name + ", price=" + price + "]";
     }
     
}

