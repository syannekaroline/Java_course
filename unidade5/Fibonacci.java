import java.util.Scanner;

public class Fibonacci {

	public static void fibonacci(int numero){
		int s1 = 1,s2 = 1,s = 0;

		System.out.print(s1+","+s2+",");
		for(int i =3; i<=numero; i++){ 
			s = s1 + s2;
			s1 = s2;
			s2 = s;
			System.out.print(s+",");
		}		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Favor informar o número");
		int numero = scan.nextInt();
		fibonacci(numero);
		scan.close();
	}
}
