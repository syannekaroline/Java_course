import javax.swing.JOptionPane;
public class CalculaMedia50Alunos {

	public static void main(String[] args) throws Exception{
		
		final double numero_avaliacoes = 4; 
		double nota1, nota2, nota3, nota4; 
		double media, media50alunos = 0;
		int i;
			
		for(i =1; i<=5; i++){
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1 do aluno  "+i+": "));
		
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2 do aluno: "+i+": "));
			nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3  do aluno "+i+": "));

			nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 4 do aluno "+i+": "));
		
			media = (nota1+nota2+nota3+nota4)/numero_avaliacoes;
			media50alunos = media50alunos + media;
		}
		media50alunos = media50alunos/i;
		JOptionPane.showMessageDialog(null, "Media dos 5 alunos="+media50alunos, "Media dos alunos",1);
	}
}
