import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class csvReader {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("C:\\Users\\Administrator\\eclipse-workspace\\Java-Programming-Part-3\\LearnArray\\src\\cities.csv");
		int countData = 0;
		Scanner sc = new Scanner(inputFile);
		sc.useDelimiter("\\Z");
		String wholeCsv = sc.next();
		String[] rows = wholeCsv.split("\n");
		String[] cities = new String[rows.length -1];
		String[] states = new String[rows.length -1];
		//row0 mai chai name of cities
		for(int i = 1; i < rows.length; i ++) {
			String[] data = rows[i].split(",");
			
			String[] data2 = data[8].split("\"");
			cities[i-1] = data2[1];
			states[i-1] = data[9];
		}
		System.out.println(Arrays.toString(cities));
		System.out.println(Arrays.toString(states));
		
		int minName = 0;
		int maxName = 0;
		for(int i = 0; i < cities.length ; i++) {
			if(i == 0) {
				minName = cities[i].length();
				maxName = cities[i].length();
			}else {
				minName = Math.min(minName, cities[i].length());
				maxName = Math.max(maxName, cities[i].length());
			}
		}
		System.out.println("min Name " + minName);
		System.out.println("Max Name " + maxName);
		File destinationFile = new File("C:\\Users\\Administrator\\Desktop\\lottery.csv");
		BufferedWriter out = new BufferedWriter(new FileWriter(destinationFile));
		out.write("CODE,CITY,STATE,FIRST PRIZE,2TUA\n");
		for(int i = 0;i < cities.length; i ++) {
			//int a =  (int) Math.floor(Math.random()*1000000);
			String shortName = cities[i].charAt(0) + "" + cities[i].charAt(1);
			String row = shortName + "," + cities[i] + "," + states[i] + "," +  randomNumber(7) + "," + randomNumber(2) + "\n";
			 
			out.write(row);
		}
		out.close();
	//	String test = "Bangkok";
		//System.out.println(test.charAt(0) + "" + test.charAt(1));
		//System.out.println(sc.next());
	}
	
	public static String randomNumber(int number) {
		String result = "";
		for(int i =0; i < number ; i ++) {
			int rand = (int) Math.floor( Math.random() * 10 ) ;
			result = result + rand;
		}
		return result;
	}
	
	
}
