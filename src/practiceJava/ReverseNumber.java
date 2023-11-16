package practiceJava;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 146;
		int res = 0;
		while(num!=0) {
			res = (res*10)+num%10;
			num = num/10;
		}
		System.out.println(res);
	}

}
