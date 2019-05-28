
public class Finbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		
		System.out.print(a + " " + b + " ");
		int nextFibonnaci = a + b;
		while(nextFibonnaci < 100) {
			System.out.print(nextFibonnaci + " ");
			a = b;
			b = nextFibonnaci;
			nextFibonnaci = a + b;
		}
		
	}

}
