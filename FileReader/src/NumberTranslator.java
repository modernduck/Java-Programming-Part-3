import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTranslator {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File sourceFile = new File("C:\\Users\\Administrator\\eclipse-workspace\\Java-Programming-Part-3\\FileReader\\src\\input.txt");
		Scanner in = new Scanner(sourceFile);
		
		while(in.hasNextInt()) {
			//System.out.println(in.nextInt());
			int number = in.nextInt();
			switch(number) {
			case 1: System.out.println("one");
				break;
			case 2: System.out.println("two");
				break;
			case 3: System.out.println("three");
				break;
			case 4: System.out.println("four");
				break;
			case 5: System.out.println("five");
				break;
			case 6: System.out.println("six");
				break;
			case 7: System.out.println("seven");
				break;
			case 8: System.out.println("eight");
				break;
			case 9: System.out.println("nine");
				break;
			case 10: System.out.println("ten");
				break;
			default:
				System.out.println("-");
				
			}
		}
		
	}

}
