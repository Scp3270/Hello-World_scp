package homework5;

public class RegularPay extends PayCalculator {
	
	public RegularPay(Double rate) {
		super(rate);
	}

	public static void main(String[] args) {
		
		RegularPay reg1 = new RegularPay(50.0);
		
		double regPayment = reg1.computePay(20.0);
		
		System.out.println("Your pay is " + regPayment);
		
	}
}
