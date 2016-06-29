import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseString {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the string:");
		String word=br.readLine();
		
		char[] revword=word.toCharArray();
		 int length=revword.length-1;
		 System.out.println("Reverse word is ");
		for(int i=length;i>=0;i--){
		System.out.print(revword[i]);
		}
		
		
	}

}
