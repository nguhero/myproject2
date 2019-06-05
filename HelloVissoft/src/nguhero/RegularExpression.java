package nguhero;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String pattern="^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
	String str="";
	while(!str.equals("huy")) {
	str=scanner.nextLine();
	System.out.println(Pattern.matches(pattern, str));
	}
	scanner.close();
}
}
