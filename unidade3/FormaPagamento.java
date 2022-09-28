import javax.swing.JOptionPane;

public class FormaPagamento {

	public static void main(String[] args) {
		
		double valor_produto, valor_final_produto;
		int codigo;
		
		valor_produto = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do produto"));
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o tipo de pagamento "
				+ "[1 - 10% desconto � vista][2 - 5% de desconto no cart�o]"
				+ "[3- 2x sem juros][4 - 3 x com juros de 10%]"));
		
		switch(codigo)
		{
			case 1: //desconto de 10%
			{
				valor_final_produto = valor_produto*0.9;
				JOptionPane.showMessageDialog(null, "O valor final com desconto de 10% ser� de "+valor_final_produto);
			    break;
			}
			case 2: //desconto de 5%
			{
				valor_final_produto = valor_produto*0.95;
				JOptionPane.showMessageDialog(null, "O valor final com desconto de 5% ser� de "+valor_final_produto);
			    break; 
			}
			case 3: //2x sem juros
			{
				valor_final_produto = valor_produto;
				JOptionPane.showMessageDialog(null, "O valor em 2x sem juros ser� de "+valor_final_produto/2);
			    break;
			}
			case 4: //3x com juros de 10%
			{
				valor_final_produto = valor_produto*1.1;
				JOptionPane.showMessageDialog(null, "O valor em 3x com juros de 10% ser� de "+valor_final_produto/3);
			    break;
			}			
			default:
			{
				JOptionPane.showMessageDialog(null, "Op��o digitada incorreta");
				FormaPagamento.main(null);
			}
		}
	}
}
