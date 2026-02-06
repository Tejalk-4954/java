package OOPs;

public class Clothing extends Product {

	public Clothing(int productId, String pname, double price) {
		super(productId, pname, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateFinalPrice() {
		// TODO Auto-generated method stub
		return price-(price*0.20);
	}

}
