
public class Counter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while
		int counter = 10;
		while(counter >= 0) {
			System.out.print(counter + " ");
			counter = counter - 1;
		}
		System.out.println("");
		System.out.println("Use do while");
		int counter2 = 10;
		do {
			System.out.print(counter2 + " ");
			counter2 = counter2 - 1;
		}while(counter2 >= 0);
			
		System.out.println("");
		System.out.println("Use for loop");
		
		for(int counter3 = 10; counter3 >= 0; counter3--) {
			System.out.print(counter3 + " ");
		}
			
			
			
	}

}
