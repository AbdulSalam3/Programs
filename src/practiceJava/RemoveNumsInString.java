package practiceJava;

import java.util.Scanner;

public class RemoveNumsInString {

		public static String removeAllDigit(String str)
	    {
	        char[] charArray = str.toCharArray();
	        String result = "";
	        for (int i = 0; i < charArray.length; i++) {
	            if (!Character.isDigit(charArray[i])) {
	                result = result + charArray[i];
	            }
	        }
	        return result;
	    }
		
	    public static void main(String args[])
	    {   
	    	Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        System.out.println(removeAllDigit(str));
	    }
}
