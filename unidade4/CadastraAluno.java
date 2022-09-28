import javax.swing.JOptionPane;

public class CadastraAluno {

	public static void main(String[] args) throws Exception {
		String nome, endereco, telefone;
		int N_matricula, saida = 1;
		
		do{
			N_matricula=Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o número de matrícula: "));
			nome=JOptionPane.showInputDialog("Informe o nome do aluno: ");
			
			endereco=JOptionPane.showInputDialog("Informe o endereço do aluno: ");
			
			telefone=JOptionPane.showInputDialog("Informe o telefone do aluno: ");
			JOptionPane.showMessageDialog(null, "nome: "+nome+"\nMatricula: "+N_matricula+"\nEndereço "+endereco+"\nTelefone: "+telefone, "Dados cadastrados: ", 1);
			
			saida= JOptionPane.showConfirmDialog(null,"Dejesa continuar o cadasro de alunos?","Selecione uma opção: ",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
		}while(saida == 0);
	}

}
