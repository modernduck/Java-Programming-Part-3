import java.util.Scanner;
public class Triangle {

	public static void pimdow(int dow) {
		for(int count = 1; count <= dow; count = count + 1) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int counter = 1;
		while(counter <= row) {
			pimdow(counter);
			counter = counter + 1;
		}
		
	}

}
