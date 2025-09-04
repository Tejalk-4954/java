package multi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamApi_count {
public static void main(String[] args) {
	
	List<product> list=new ArrayList<product>();
	
	
	for(int i=0;i<40;i++)
	{
		list.add(new product(i,"A"+i,i+1.0+5.0));
	}
	
	System.out.println(list);
	long v=list.stream().count();
	
System.out.println("count::"+v);
	
}
}

class product
{
   int id;	
   String name;
   double price;
   
   public product(int id,String name,double price)
   {
	   this.id=id;
	   this.name=name;
	   this.price=price;
   }
}

class pricecomparator implements Comparator<product>
{

	@Override
	public int compare(product o1, product o2) {
		
		int i1=(int)o1.price;
		int i2=(int)o2.price;
		return i2-i1;
	}
	
}