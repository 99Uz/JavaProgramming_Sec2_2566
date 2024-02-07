import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException{
		// use bufferedReader read data from file
		BufferedReader readFile = new BufferedReader(new FileReader("D://txtFile//BookData.txt"));
		String tmp = "";
		int countBook = 0, i = 1;
		while((tmp = readFile.readLine()) != null) {
			String[] data = tmp.split("\t");
			
			System.out.println(i + "." + data[0] + " (" + data[1] + "), Rating " + data[2] + " publish on "
							   + data[5]);
			i++;
			countBook++;
		}
		System.out.println("===================================================================");
		System.out.println("Total number of book : " + countBook);
		readFile.close();
	}

}
