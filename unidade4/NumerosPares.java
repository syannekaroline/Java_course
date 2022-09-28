import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Favor informar o numero A");
		int a = scan.nextInt();
		
		System.out.println("Favor informar o numero B");
		int b = scan.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			if (i%2==0)
				System.out.println("O numero:"+i+" u par!");
		}
		scan.close();
	}
}
