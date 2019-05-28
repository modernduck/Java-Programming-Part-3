import java.util.Scanner;
public class HelloLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int counter = 1;
		while(counter < 100) {
			System.out.print(counter + " ");
			//counter = counter + 1;
			counter += 2;
			//counter++;
		}
	}

}
