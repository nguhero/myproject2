package nguhero.Bai2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class B2 {
public static void main(String[] args) {
	try {
		Scanner scanner=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new FileReader("C:/java/phone.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:/java/result.txt"));	
		String str;
		System.out.print("Nhap so can tim: ");
		String find=scanner.nextLine();
		String pattern="";
		for(int i=0;i<find.length();i++) {
			if(String.valueOf(find.charAt(i)).equals("*")) {
				pattern=pattern+"[\\d]*";
			}else {
				pattern=pattern+String.valueOf(find.charAt(i));
			}
		}
		while((str=br.readLine())!=null) {
			String result[]=str.split(",");
			if(result[0].matches(pattern)) {
				Phone phone=new Phone(result[0],result[1],Integer.parseInt(result[2]));
				bw.write(phone.toString());
				bw.newLine();
				System.out.println(phone.toString());
				
			}
		}
		br.close();
		bw.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
