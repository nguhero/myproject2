package nguhero;

public class Tong10 {
public static void main(String[] args) {
	int count=0,i=0,so=1;
	while(i<10) {
		if(so%2==0) {
			count+=so;
			i++;
		}
		so++;
	}
	System.out.println(count);
}
}
