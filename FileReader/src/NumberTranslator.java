import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumberTranslator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File sourceFile = new File("C:\\Users\\Administrator\\eclipse-workspace\\Java-Programming-Part-3\\FileReader\\src\\input.txt");
		Scanner in = new Scanner(sourceFile);
		String result = "";
		while(in.hasNextInt()) {
			//System.out.println(in.nextInt());
			int number = in.nextInt();
			switch(number) {
			case 1: result = result + "one";
				break;
			case 2: result = result + "two";
				break;
			case 3:  result = result + "three";
				break;
			case 4:  result = result + "four";
				break;
			case 5:  result = result + "five";
				break;
			case 6:  result = result + "six";
				break;
			case 7:  result = result + "seven";
				break;
			case 8:  result = result + "eight";
				break;
			case 9:  result = result + "nine";
				break;
			case 10:  result = result + "ten";
				break;
			}
			result = result + "\r\n";
		}
		File destination = new File("C:\\Users\\Administrator\\Desktop\\output.txt");
		BufferedWriter out = new BufferedWriter(new FileWriter(destination));
		
		out.write(result);
		out.close();
	}

}
