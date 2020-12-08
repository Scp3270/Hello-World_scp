package homework5;

public abstract class PayCalculator {
		
	double payRate; 
	
	public double computePay(double hours) {
		return hours*payRate;
	}
	
	public PayCalculator(double rate) {
		payRate = rate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
}
