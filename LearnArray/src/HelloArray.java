import java.util.Arrays;
import java.util.Scanner;

public class HelloArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in2 = new Scanner(System.in);
		System.out.print("How many people?:");
		int amountOfPeople = in2.nextInt();
		int[] heights = new int[amountOfPeople];
		int[] weights = new int[amountOfPeople];
		for(int i = 0; i < heights.length ; i++ ) {
			Scanner in = new Scanner(System.in);
			System.out.print("Height:");
			heights[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(heights) );
		
	}

}
