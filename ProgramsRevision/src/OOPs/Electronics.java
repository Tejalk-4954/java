package OOPs;

public class Electronics extends Product {

	public Electronics(int productId, String pname, double price) {
		super(productId, pname, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateFinalPrice() {
		// TODO Auto-generated method stub
		return price-(price*0.10);
	}
   
}
