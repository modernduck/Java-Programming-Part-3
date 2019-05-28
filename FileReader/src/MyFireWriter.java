import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class MyFireWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myfile = new File("C:\\Users\\Administrator\\Desktop\\mywrite.txt") ;
		BufferedWriter out = new BufferedWriter(new FileWriter(myfile));
		out.write("TEST WRITE\r\nMYTEXT");
		out.close();
	}

}
