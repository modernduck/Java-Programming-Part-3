import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MyFileReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File myfile = new File("C:\\Users\\Administrator\\eclipse-workspace\\Java-Programming-Part-3\\FileReader\\src\\test.txt");
		Scanner sc = new Scanner(myfile);
		float sum = 0;
		int count = 0;
		while(sc.hasNextFloat()) {
			float b = sc.nextFloat();
			sum += b;
			count = count + 1;
		}
		System.out.println("SUM " + sum);
		System.out.println("AVG " + (sum / count));
		
		
	}

}
