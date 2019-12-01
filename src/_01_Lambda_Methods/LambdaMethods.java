package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			char[] chars = new char[s.length()];
			int j = 0;
			for(int i = s.length() - 1; i > -1; i--) {
				chars[j] = s.charAt(i);
				j++;
			}
			System.out.println(new String(chars));
			
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				if(i%2 == 1) {
					
					System.out.print((s.charAt(i) + "").toUpperCase());
				}
				else {
					System.out.print((s.charAt(i) + "").toLowerCase());
				}
			}
			System.out.println();
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {

				System.out.print(s.charAt(i));
				System.out.print(".");
				
			}
			System.out.println();
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				if((s.charAt(i)+"").equalsIgnoreCase("a") || (s.charAt(i)+"").equalsIgnoreCase("e") || (s.charAt(i)+"").equalsIgnoreCase("i") || (s.charAt(i)+"").equalsIgnoreCase("o") || (s.charAt(i)+"").equalsIgnoreCase("u") || (s.charAt(i)+"").equalsIgnoreCase("y")) {
					
				}
				else {
					System.out.print(s.charAt(i));
				}
			}
		}, "repeat");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
