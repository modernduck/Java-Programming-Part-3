import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File destinationFile = new File("C:\\Users\\Administrator\\Desktop\\sequence.txt");
		BufferedWriter out = new BufferedWriter(new FileWriter(destinationFile));
		out.write(1 + "\r\n");
		for(int i = 0 ; i <= 100000; i = i + 5) {
//			System.out.println(i);
			out.write(i + "\r\n");
		}
		out.close();
		
	}

}
