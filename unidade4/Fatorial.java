import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) throws Exception {
		
		double fatorial = 1;
		int numero, i;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Favor informar o n�mero");
		numero = scan.nextInt();
		i = numero;
		while (i >=1){
			fatorial = fatorial * i;
			i--;
		}
		System.out.println("O fatorial do n�mero:"+numero+"="+fatorial);
		scan.close();
	}
}
