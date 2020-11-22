package Homework4;

public class combineOrders {
	
	public static void main(String[] args) {
		
		int[] order1 = {1,2,3,4,5};
		int[] order2 = {5,4,3,2,1}; // 6 6 6 6 6 6 
		
		int[] value4 = combineOrder(order1,order2);
		for (int i : value4) {
			System.out.println(i);} 
		
			}
		
		 public static int[] combineOrder(int[] order1, int[] order2){
		        
		        int[] combinedOrder = new int[5];
		        for(int i=0; i<5; i++){
		            combinedOrder[i] = order1[i] + order2[i];
		        }
		        
		        return combinedOrder;
	}

}
