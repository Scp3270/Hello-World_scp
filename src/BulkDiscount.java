package homework5;

public class BulkDiscount extends DiscountPolicy {

	int minimum;
	double percent;
	
	public BulkDiscount(int Min,double Per) {
		
		minimum = Min;
		percent = Per;
	}
	
	@Override
	public double computeDiscount(int count,double itemCost) {
		// TODO Auto-generated method stub
		
		double discount = 0.0; 
		
		if (count > minimum) {
			
			discount = count*itemCost*percent/100;
		}
		
		return discount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BulkDiscount disc1 = new BulkDiscount(10,5.0);
	
		double actualDiscount = disc1.computeDiscount(10,5.0);
		
		System.out.println("You are eligible for a discount of " + actualDiscount);
	}

}
