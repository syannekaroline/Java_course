import java.util.Scanner;

public class CalculaMediav2 {

	public static void main(String[] args) throws Exception{
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o valor");
		var valor = teclado.nextInt();
		
		var soma_valor = 0;
		var cont = 0;
		
		do{
			if (valor != -1){
				soma_valor = soma_valor + valor;
				cont++;
				System.out.println("Favor informar o valor");
				valor = teclado.nextInt();
			}
		} while (valor != -1);
		
		if (cont !=0)
			System.out.println("Mediia="+soma_valor/cont);
		teclado.close();
	}

}
