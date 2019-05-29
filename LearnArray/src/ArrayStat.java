
public class ArrayStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] scores = {50.5, 62, 73.4, 63.2, 23.2,46.7, 48.9 ,80, 95.3 ,100};
		double sum = 0;
		double average = 0;
		double max = -1;
		double min = -1;
		for(int i = 0; i < scores.length ; i++) {
			sum = sum + scores[i];
			if(i == 0) {
				max = scores[i];
				min = scores[i];
			}else {
				max = Math.max(max, scores[i]);
				min = Math.min(min, scores[i]);
			}			
		}
		average = sum / scores.length;
		System.out.println("SUM " + sum);
		System.out.println("Average " + average);
		System.out.println("Max " + max);
		System.out.println("Min " + min);
		//
		
	}

}
