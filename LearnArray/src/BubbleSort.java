import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,3,7,1,2,6,9,8,0};
		//na ja me another loop krop this for!!!
		for(int j=0; j < a.length;j ++) {
			for(int i =0; i < a.length -1 ; i++) {
				System.out.println(a[i]+ "," + a[i + 1]);
				if(a[i] > a[i + 1]) {
					int c = a[i];
					a[i] = a[i + 1];
					a[i + 1] = c;
				}
				System.out.println(a[i]+ "," + a[i + 1]);
			}
		}
		
		System.out.println(Arrays.toString(a));
		int[] b = {4,5,3,7,1,2,6,9,8,0};
		Arrays.sort(b, 0, b.length);
		System.out.println(Arrays.toString(b));
		
		
		
	}

}
