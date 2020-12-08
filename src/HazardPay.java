package homework5;

public class HazardPay extends PayCalculator {

	public HazardPay(double rate) {
		super(rate);
		// TODO Auto-generated constructor stub
	}
	
	public double computePay(double hours) {
		return super.computePay(hours*1.5) ;
	}
	
	public static void main(String[] args) {

		HazardPay haz1 = new HazardPay(20.0);
		
		double hazardPayment = haz1.computePay(20.0);
		
		System.out.println("Your hazard pay is " + hazardPayment);
		
	}

}
