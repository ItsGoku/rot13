package bos;


public class rot {
	
	public static String encode(String word) {
		
		String enword = "";
		
		for (int i=0; i<word.length(); i++) {

			char ch = word.charAt(i);
			ch += 13;
			enword += ch;
			
		}
		
		return enword;
		
	}
	
	public static String decode(String word) {
		
		String deword = "";
		
		for (int i=0; i<word.length(); i++) {

			char ch = word.charAt(i);
			ch -= 13;
			deword += ch;
			
		}
		
		return deword;
	}
		
	
	public static void main(String[] args) {
		
		System.out.println(encode("abcde"));
		System.out.println(decode("nopqr"));
		
	}

}
