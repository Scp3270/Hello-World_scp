package Homework4;

public class isStrctlyIncreasing {
	
	public static void main(String[] args) {
		
		double[] x = {1.0, 4.0, 9.0};
		
		boolean value = isStrictlyIncreasing(x);
		System.out.println(value);
		
	}
	
	public static boolean isStrictlyIncreasing(double[] in) {
		boolean result = true;
		for(int i=0; i< (in.length - 1); i++) {
			if(in[i+1] <= in[i])
				result = false;
		}
		return result;
	}
}
	