package Homework4;

public class removeInt {
	
	public static void main(String[] args) {
		
		int[] z = {0,1,3,2,3,0,3,1};
		
		int[] value3 = remove(3,z);
		for (int i : value3) {
			System.out.println(i);
		}
	}

	public static int[] remove(int v, int[] in) { 
		
		int count = 0;
				for(int i = 0; i<in.length; i++) {
					if(in[i] != v)
						count++;
				}
		
		int result[] = new int[count];
		int position = 0;
				for (int i=0; i<in.length; i++) {
					if(in[i] !=v) {
						result[position] = in[i];
						position++;
					}
				}
		return result;
	}
}
