import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

;

public class Ocurec {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the strings");
		String str = br.readLine();
		System.out.println("enter the occurence");
		String ocr = br.readLine();
		char cd = ocr.charAt(0);

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == cd)

				count = count + 1;
		}

		System.out.println("the value of "+cd+" is"+count);

	}

}
