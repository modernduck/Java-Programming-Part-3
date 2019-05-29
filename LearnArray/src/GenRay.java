import java.util.Arrays;

public class GenRay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] a = {10, 9 ,8 ,7 ,6 ,5, 4, 3, 2, 1};
		System.out.println(Arrays.toString(a));
		int[] b = new int[20];
		for(int i =0; i < b.length ; i++) {
			b[i] = i + 1;
		}
		System.out.println(Arrays.toString(b));*/
		
		/*int[] gen = new int[16];
		for(int i =0 ; i < gen.length; i++) {
			System.out.println(i * 2 + 20);
			gen[i] = i * 2 + 20;
		}
		System.out.println(Arrays.toString(gen));*/
		/*int [] gen2 = new int[150];
		for(int i =0 ; i < gen2.length; i++) {
			System.out.println(i * 2 + 1 + 200);
			gen2[i] = i * 2 + 1 + 200;
		}
		System.out.println(Arrays.toString(gen2));*/
		long[] rands = new long[10];
		for(int i = 0; i < rands.length ; i++) {
			long rand = Math.round(Math.random() * 10);
			rands[i] = rand;
		}
		System.out.println(Arrays.toString(rands));
	}

}
