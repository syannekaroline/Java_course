import java.util.Scanner;

public class NumeroEstrelas {

	public static void main(String[] args) throws Exception {
		
		int i, numero_linhas;
		String estrela = "*";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Favor informar o n�mero de linhas");
		numero_linhas = scan.nextInt();
		
		for(i=1; i<=numero_linhas;i++)
		{
			System.out.println(estrela);
			estrela = estrela + "*";
		}
		scan.close();
	}
}
