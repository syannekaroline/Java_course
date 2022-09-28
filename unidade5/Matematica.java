import java.util.Scanner;

public class Matematica {

	public static void tabuada(int numero){
		int total;
		for(int i=1;i<=10;i++){
			total = numero * i;
			System.out.println("Número:"+numero+"x"+i+"="+total);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Favor informar a nota do aluno");
		int numero = scan.nextInt();
		tabuada(numero);
		scan.close();
	}
}
