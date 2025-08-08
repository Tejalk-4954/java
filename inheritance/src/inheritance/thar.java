package inheritance;

public class thar extends car {

	public static void main(String[] args) {
    thar th=new thar();
    th.special();
    th.car1();
    th.travelling();
	}

	 public void special()
	 {
		 System.out.println("thar is suitable for driving in the mountains");
	 }
}
