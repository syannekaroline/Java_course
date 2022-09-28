import javax.swing.JOptionPane;

public class NumeroPrimo {

	public static void main(String[] args) throws Exception{
		var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero"));
		int numero_divisores = 0;
		
		for(int i =1; i <= numero; i++)
		{
			if(numero%i == 0)
				numero_divisores++;
		}
		if (numero_divisores == 2)
			JOptionPane.showMessageDialog(null, "O numero "+numero+" u Primo!");
		else
			JOptionPane.showMessageDialog(null, "O n�mero "+numero+" nao e Primo!");
	}

}
