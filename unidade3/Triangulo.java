import javax.swing.JOptionPane;

public class Triangulo {
	public static void main(String[] args) {
		int ladoA,ladoB,ladoC;
		
		ladoA=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado A do triângulo"));
		ladoB=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado B do triângulo"));
		ladoC=Integer.parseInt(JOptionPane.showInputDialog("Digite o lado C do triângulo"));
		
		if ((ladoA<ladoB+ladoC) && (ladoB<ladoA+ladoC) && (ladoC<ladoA+ladoB)){
			if ((ladoA==ladoB)&&(ladoB==ladoC))
				JOptionPane.showMessageDialog(null,"Triingulo Equilátero!");
			else{
				if ((ladoA==ladoB) || (ladoB==ladoC))
					JOptionPane.showMessageDialog(null,"Triingulo Isósceles!");
				else
					JOptionPane.showMessageDialog(null,"Triingulo Escaleno!");
			}
		}
		else
			JOptionPane.showMessageDialog(null,"Não se pode formar um triângulo com essas medidas de lado!");
	}
}
