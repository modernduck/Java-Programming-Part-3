import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SortFile {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("C:\\Users\\Administrator\\eclipse-workspace\\Java-Programming-Part-3\\LearnArray\\input.txt");
		Scanner in = new Scanner(inputFile);
		int[] a = new int[10];
		int index = 0;
		while(in.hasNextInt()) {
			a[index] = in.nextInt();
			index++;
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		File outputFile = new File("C:\\Users\\Administrator\\Desktop\\output.txt");
		BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));
		for(int i =0; i < a.length ; i++) {
			out.write(a[i] + "\r\n");
		}
		out.close();
	}
}
