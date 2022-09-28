import javax.swing.JOptionPane;
public class CalculaE {
	public static void main(String[] args) throws Exception{
		
		double x, e = 0;
		int i;
		
		x=Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X : "));

		for(i=1;i<=50;i++)
			e = e + Math.pow(x, i)/i;
		JOptionPane.showMessageDialog(null, "O valor de E^"+x+"="+e, "valor de E", 1);
	}
}
