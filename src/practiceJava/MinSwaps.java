package practiceJava;

public class MinSwaps {

	public static void main(String[] args) {
		String str1 = "junaid";
		String str2 = "unadij";
		int count = 0;
		int position = 0;
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		
		for(int i=0;i<charArr1.length;i++) {
			if(charArr1[i] != charArr2[i]) {
				for(int j=0;j<charArr2.length;j++) {
					if(charArr1[i] == charArr2[j]) {
						charArr2[position] = charArr2[j];
						char temp = charArr2[j];
		                charArr2[j] = charArr2[j-1];
		                charArr2[j-1] = temp;
		                System.out.println(new String(charArr2));
						position++;
						count++;
						break;
					}
					else {
						continue;
					}
				}
				
			}else {
				continue;
			}
		}System.out.println(count);
	}
}
