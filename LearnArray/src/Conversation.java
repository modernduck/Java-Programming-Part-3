import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Conversation {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*String message = "Sompop:Hello how is your day";
		System.out.println(message.length());
		String[] result = message.split(":");
		System.out.println(Arrays.toString(result));*/
		File inputFile = new File("C:\\Users\\Administrator\\Desktop\\chatlog.txt");
		Scanner in = new Scanner(inputFile);
		String[] sompopMessages = new String[2];
		String[] youMessages  = new String[2];
		int indexSompop = 0;
		int indexYou = 0;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			String[] data = line.split(":");
			//System.out.println(Arrays.toString(data));
			if(data[0].equals("SOMPOP") ) {
				//add message in sompop message array
				sompopMessages[indexSompop] = data[1];
				indexSompop ++;
			}else  {
				//add message in other array
				youMessages[indexYou] = data[1];
				indexYou ++;
			}
		}
		System.out.println(Arrays.toString(sompopMessages));
		System.out.println(Arrays.toString(youMessages));
		
	}

}
