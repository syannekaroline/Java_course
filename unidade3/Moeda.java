import javax.swing.JOptionPane;

public class Moeda {

	public static void main(String[] args) {
		
		double valor, valor_convertido;
		int tipo_moeda;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor a ser convertido"));
		Object[] moedas = { "Libra","Dólar","Euro" };
        Object val = JOptionPane.showInputDialog(null, "Escolha o Tipo de moeda",
            "Tipo de moeda", JOptionPane.INFORMATION_MESSAGE, null,
            moedas, moedas[0]);
		System.out.println(val);
		if (val=="Libra")
			tipo_moeda=1;
		else if(val=="Dóla")
			tipo_moeda=2;
		else
			tipo_moeda=3;
		switch(tipo_moeda)
		{
			case 1: 
			{
				valor_convertido = valor/5;
				JOptionPane.showMessageDialog(null, "O valor convertido em Libras é de "+valor_convertido);
			    break;
			}
			case 2:
			{
				valor_convertido = valor/4;
				JOptionPane.showMessageDialog(null, "O valor convertido em Dólar é de "+valor_convertido);
			    break; 
			}
			case 3:
			{
				valor_convertido = valor/4.4;
				JOptionPane.showMessageDialog(null, "O valor convertido em Euro é de "+valor_convertido);
			    break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Opção digitada incorreta");
		}
	}
}
