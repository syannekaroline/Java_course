import java.util.Scanner;

public class MenorValor {

	public static void main(String[] args) throws Exception {
		
		int valor, menor, maior; 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o valor");
		valor = teclado.nextInt();
		menor = valor;
		maior = valor;
		
		while(valor!=0){
			if (valor < menor)
				menor = valor;
			else if (valor > maior)
				maior = valor;
			System.out.println("Favor informar o valor");
			valor = teclado.nextInt();			
		}
		
		System.out.println("O menor valor e:"+menor);
		System.out.println("O maior valor e:"+maior);
		teclado.close();
	}
}
