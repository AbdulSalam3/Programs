package practiceJava;

import java.util.Scanner;

public class changeUppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String s1 = sc.nextLine();
		String s2 = "";
		for(int i=0;i<s1.length();i++) {
			if(i%2==0) {
				 char ch = s1.charAt(i);
				s2= s2 + Character.toUpperCase(ch);
				 
			}else {
				s2 = s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
	/* Method-2
	 * char [] ch = s1.toCharArray();
	 * for(i=0;i<ch.length;i++){
	 * if(i%2==0){
	 * ch[i]=Charater.toUpperCase(ch[i]);
	 * }
	 * }
	 * Sysout(new String(ch));
	 */

}
