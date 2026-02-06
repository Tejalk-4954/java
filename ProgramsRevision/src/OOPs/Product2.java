package OOPs;

public class Product2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1=new Electronics(101,"laptop",5489.88);
		Product p2=new Clothing(102,"tab",3245.67);
		
		System.out.println("final price of "+p1.getPname()+":"+p1.calculateFinalPrice());
		System.out.println("final price of "+p2.getPname()+":"+p2.calculateFinalPrice());

	}

}
