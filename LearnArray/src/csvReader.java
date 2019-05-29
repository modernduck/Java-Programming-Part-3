import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class csvReader {
	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("C:\\Users\\Administrator\\eclipse-workspace\\Java-Programming-Part-3\\LearnArray\\src\\cities.csv");
		int countData = 0;
		Scanner sc = new Scanner(inputFile);
		sc.useDelimiter("\\Z");
		String wholeCsv = sc.next();
		String[] rows = wholeCsv.split("\n");
		String[] cities = new String[rows.length -1];
		for(int i = 1; i < rows.length; i ++) {
			//System.out.println(rows[i]);
			String[] data = rows[i].split(",");
			//System.out.println(data[8]);
			String[] data2 = data[8].split("\"");
			//System.out.println(data2[1]);
			cities[i-1] = data2[1];
		}
		System.out.println(Arrays.toString(cities));
		//System.out.println(rows[1]);
		//System.out.println(sc.next());
	}
}
