import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Favor informar o valor");
		var valor = scan.nextInt();
		
		var soma_valor = 0;
		var cont = 0;
		
		while(valor != -1){
			soma_valor = soma_valor + valor;
			cont++;
			
			System.out.println("Favor informar o valor");
			valor = scan.nextInt();			
		}
		System.out.println("Media="+soma_valor/cont);
		scan.close();
	}
}
