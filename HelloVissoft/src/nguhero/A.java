package nguhero;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String str=scanner.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++) {
        	if(String.valueOf(str.charAt(i)).equals("a")) {
        		count++;
        	}
        }
        
        System.out.println(count);
        scanner.close();
	}
	

}
