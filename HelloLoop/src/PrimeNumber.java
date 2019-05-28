
public class PrimeNumber {

	public static boolean isPrimeNumber(int a) {
		if(a < 2) {
			return false;
		}if(a == 2) {
			return true;
		}else{
			//a 8
			//counter 2 3 4 5 6 7 
			for(int counter = 2; counter < a; counter = counter + 1) {
				if(a % counter == 0)
					return false;
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100000 ; i ++) {
			if(isPrimeNumber(i))
				System.out.println(i);
		}
	}

}
