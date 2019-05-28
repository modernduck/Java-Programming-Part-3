import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;
public class MyFileReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File myfile = new File("C:\\Users\\Administrator\\eclipse-workspace\\Java-Programming-Part-3\\FileReader\\src\\test.txt");
		Scanner sc = new Scanner(myfile);
		float sum = 0;
		int count = 0;
		float max = -99999999;
		float min = 999999999;
		while(sc.hasNextFloat()) {
			float b = sc.nextFloat();
			if(count == 0 ) {
				max = b;
				min = b;
			}else {
				max = Math.max(max, b);
				min = Math.min(min, b);
			}
			sum += b;
			count = count + 1;
		}
		System.out.println("SUM " + sum);
		System.out.println("AVG " + (sum / count));
		System.out.println("Max " + max);
		System.out.println("Min " + min);
		
		
	}

}
