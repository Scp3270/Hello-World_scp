package Homework4;

public class removeDuplicates {
	 
	public static void main(String[] args) {
		
		Character[] d = {'b','d','a','b','f','m','g','n','a','f'};
		
		Character[] value1 = removeDuplicates(d);
		for (Character character : value1) {
			System.out.println(value1);
		}
	}
		
		private static Character[] removeDuplicates(Character[] d) {
		return null;
	}

		public static Character removeDuplicates; Character[] in; {
			boolean set[] = new boolean[in.length];
			
			for(int i=0; i<in.length; i++) {
				set[i] = true;
			}
			
			for(int i=0; i<in.length; i++) {
				if(set[i])
					for(int j=i+1; j<in.length; j++) {
						if(in[i] == in[j])
							set[j] = false;
					}
			}
			
					}
	
}
