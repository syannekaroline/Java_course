import javax.swing.JOptionPane;
public class CadastroAlunos {
	public static void main(String[] args) throws Exception {
		String Alunos[],enderecos[],telefones[];
        int N_matriculas[],saida = 1,count=0;
        Alunos = new String[3];
        enderecos = new String[3];
        telefones = new String[3];
        N_matriculas = new int[3];
		
		do{ 
            N_matriculas[count]=Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o número de matrícula: "));
			Alunos[count]=JOptionPane.showInputDialog("Informe o nome do aluno: ");
			
			enderecos[count]=JOptionPane.showInputDialog("Informe o endereço do aluno: ");
			
			telefones[count]=JOptionPane.showInputDialog("Informe o telefone do aluno: ");
			count++;
			saida= JOptionPane.showConfirmDialog(null,"Dejesa continuar o cadastro de alunos?","Selecione uma opção: ",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
		}while(saida == 0 || saida == Alunos.length);

        for (int i = 0; i < Alunos.length; i++){
            JOptionPane.showMessageDialog(null, "nome: "+Alunos[i]
                                                +"\nMatricula: "+N_matriculas[i]
                                                +"\nEndereço "+enderecos[i]+
                                                "\nTelefone: "
                                                +telefones[i],
                                                "Dados cadastrados aluno "+(i+1)+": ", 1);
        }
	}
}