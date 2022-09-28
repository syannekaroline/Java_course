import java.util.Scanner;

public class MenorValorv2 {

	public static void main(String[] args) throws Exception{
		
		int valor, menor, maior; 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o valor");
		valor = teclado.nextInt();
		menor = valor;
		maior = valor;
		
		do{
			if (valor < menor)
				menor = valor;
			else if (valor > maior)
				maior = valor;
			System.out.println("Favor informar o valor");
			valor = teclado.nextInt();			
		}
		while(valor!=0);
		System.out.println("O menor valor e:"+menor);
		System.out.println("O maior valor e:"+maior);		
		teclado.close();
	}
}
