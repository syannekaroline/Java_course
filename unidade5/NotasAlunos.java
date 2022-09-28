import javax.swing.JOptionPane;
public class NotasAlunos {
    public static void main(String[] args) {
        String Alunos[],Conceitos[];
        Double notas[][],medias[],soma;
        int N_Aprovados=0,N_Reprovados=0;
        Alunos = new String[5];
        notas = new Double[5][4];
        medias= new Double[5];
        Conceitos=  new String[5];

		
		for(int i=0;i<5;i++) {
            soma=0.0;
			Alunos[i]=JOptionPane.showInputDialog("Informe o nome do(a) "+(i+1)+"ª aluno(a): ");
			for (int j=0;j<4;j++) {
                notas[i][j]=Double.parseDouble(JOptionPane.showInputDialog("Informe a "+(j+1)+"ª nota do(a) aluno(a) "+Alunos[i]+":"));
                soma=soma+notas[i][j];
            }
            medias[i]=soma/4;
            if (medias[i]>5){
                Conceitos[i]="Aprovado";
                N_Aprovados++;
            }
            else{
                Conceitos[i]="Reprovado";
                N_Reprovados++;
            }
		}
        JOptionPane.showMessageDialog(null, "Número de Aprovados: "+N_Aprovados+"\nNúmero de Reprovados: "+N_Reprovados, "Situação da Turma", 1);
        for (int i = 0; i < Alunos.length; i++){
            JOptionPane.showMessageDialog(null, "nome: "+Alunos[i]+"\nMédia: "+medias[i]+"\nSituação: "+Conceitos[i],"Situação dos alunos " ,1);
        }
    }

}
