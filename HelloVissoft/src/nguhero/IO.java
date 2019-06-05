package nguhero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO {
public static void main(String[] args) throws IOException {
	Scanner in=new Scanner(System.in);
	String input=in.nextLine();
	BufferedReader br=new BufferedReader(new FileReader(input));
	BufferedWriter bw=new BufferedWriter(new FileWriter("C:/java/out.txt"));
	String str;
	while((str=br.readLine())!=null) {
		if(str.matches("[\\w]*VIS\\s[\\w]*")) {
			System.out.println(str);
			bw.write(str);
			bw.newLine();
			
		}

	}
	br.close();
	bw.close();

}
}