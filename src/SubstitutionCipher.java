package homework5;

public class SubstitutionCipher implements MessageEncoder {

	
	int shift; 
	
	public SubstitutionCipher(int theShift) {
		shift = theShift;
	}
	
	@Override
	public String encode(String plainText) {
		// TODO Auto-generated method stub
		//cat encoded should be fdw 
		
		String encoded = "";
		for(int i =0; i<plainText.length(); i++) { 
			char x = plainText.charAt(i);
			//some code to shift
			x = shifter(x);
			encoded = encoded + x;
			
		}
		
		return encoded;
	}

	@Override
	public String decode(String plainText) {
		// TODO Auto-generated method stub
		//fdw should become cat 
		
		String decoded = "";
		for(int i =0; i<plainText.length(); i++) {
			char x = plainText.charAt(i);
			//some code to reverse the shift
			x = reverseShifter(x);
			decoded = decoded + x;
		}
		
		return decoded;
	}
	
	Character shifter(Character x) {
		return (char) (x+shift);
	}
	Character reverseShifter(Character x) {
		return (char) (x-shift);
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub

			String value = "Table";
			SubstitutionCipher obj1 = new SubstitutionCipher(4);
			
			String encodedString = obj1.encode(value);
			System.out.println("encoded value is " + encodedString);

			String decodedString = obj1.decode(encodedString);
			System.out.println("decoded value is " + decodedString);
			
	}
}
