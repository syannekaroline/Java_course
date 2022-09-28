import java.util.Scanner;

import javax.swing.JOptionPane;

public class MostraTabuada {
	public static void main(String[] args) throws Exception{
		
		int i, numero, total = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Favor informar o numero");
		numero = scan.nextInt();
		
		for(i=1;i<=10;i++)
		{
			total = numero * i;
			JOptionPane.showMessageDialog(null,"Numero:"+numero+"x"+i+"="+total);
		}
		scan.close();
	}
}
