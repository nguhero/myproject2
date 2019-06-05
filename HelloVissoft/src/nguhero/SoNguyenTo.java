package nguhero;

import java.util.Scanner;

public class SoNguyenTo {

public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Nhap n: ");
	int n=scanner.nextInt();
	int count=0,i=2,sum=0;
	while(count<n) {
		if(isPrime(i)) {
			count++;
            sum+=i;
		}
		i++;
	}
	System.out.println(sum);
	
	scanner.close();
}
public static boolean isPrime(int n) {
	if(n<2) return false;
	for(int i=2;i*i<=n;i++) {
		if(n%i==0) return false;
	}
	return true;
}
}