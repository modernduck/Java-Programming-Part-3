import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File destinationFile = new File("C:\\Users\\Administrator\\Desktop\\table.txt");
		BufferedWriter out = new BufferedWriter(new FileWriter(destinationFile));
		for(int i = 100000; i > 0 ; i = i - 10){
			//System.out.println(i);
			out.write((i * 32) + "\r\n");
		}
		//System.out.println(1);
		out.write((1 * 32) + "\r\n");
		out.close();
	}

}
