import java.util.Scanner;

public class NumeroDecrescente {
	public static void main(String[] args) throws Exception{
		
		int numero;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Favor informar o n�mero");
		numero = scan.nextInt();
		
		for(int i=numero; i>=1; i=i-1)
			System.out.println("Numero="+i);	
		scan.close();
	}
}
