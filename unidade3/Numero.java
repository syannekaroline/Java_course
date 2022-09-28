import javax.swing.JOptionPane;

public class Numero {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Favor informar a nota 1"));

		if (numero%2 == 0) 
			JOptionPane.showMessageDialog(null,"O número é par!");
		else
			JOptionPane.showMessageDialog(null,"O número é ímpar!");;
	}
}
