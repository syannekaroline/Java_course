import javax.swing.JOptionPane;

public class CadastraAlunov2 {

	public static void main(String[] args) throws Exception {
		String nome, endereco, telefone;
		int N_matricula, cont = 0;
		
		N_matricula=Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o número de matrícula: "));
		
		do{
			if (N_matricula != 0)
			{	
				nome=JOptionPane.showInputDialog("Informe o nome do aluno: ");
			
				endereco=JOptionPane.showInputDialog("Informe o endereço do aluno: ");
				
				telefone=JOptionPane.showInputDialog("Informe o telefone do aluno: ");
				cont++;
				N_matricula=Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o número de matrícula: "));

				JOptionPane.showMessageDialog(null,"Dados cadastrados : "+nome+N_matricula+endereco+telefone, "cadastro de alunos", 1);
			}
		}while(N_matricula != 0);	
	}
}
