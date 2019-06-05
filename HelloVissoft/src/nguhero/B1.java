package nguhero;

public class B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int i=0; i<9; i++)
        {

                for (int j=0; j<i*2+1; j++) 
                        if (j == 0 || j == i*2 || i == 0 || i == 8) {
                                System.out.print("*");
                        }
                        else {
                                System.out.print(" ");
                        }
                System.out.println();
        }
	}

	}
