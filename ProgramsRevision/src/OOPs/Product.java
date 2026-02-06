package OOPs;

public abstract class Product {
	
		private int productId;
		private String pname;
		protected double price;
		
		//constructor
		public Product(int productId,String pname, double price)
		{
			this.productId=productId;
			this.pname=pname;
			this.price=price;
		}
		
		//getters
		public int getProductId()
		{
			return productId;
		}
		
		public String getPname()
		{
			return pname;
		}
		
		public double getPrice()
		{
			return price;
		}
		
		public abstract double calculateFinalPrice();
	}


