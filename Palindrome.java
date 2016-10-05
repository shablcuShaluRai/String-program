import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Palindrome {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the string:");
		String word=br.readLine();
		
		char[] revword=word.toCharArray();
		 LinkedList<Character> word1=new LinkedList<Character>();
		 for(char c:revword)
			 word1.add(c);
		 
		
		
	}

}
