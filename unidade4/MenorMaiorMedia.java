import java.util.Scanner;

public class MenorMaiorMedia {

	public static void main(String[] args) throws Exception{
		
		double valor, menor, maior,media = 0; 
		int cont = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Favor informar o valor");
		valor = scan.nextDouble();
		menor = valor;
		maior = valor;
		
		while(valor!=0){
			cont++;
			if (valor < menor)
				menor = valor;
			else if (valor > maior)
				maior = valor;
			media = media + valor;
			System.out.println("Favor informar o valor");
			valor = scan.nextDouble();			
		}
		media = media/cont;
		System.out.println("O menor valor �:"+menor);
		System.out.println("O maior valor �:"+maior);
		System.out.println("A m�dia dos valores �:"+media);
		scan.close();
	}
}
