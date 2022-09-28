import java.util.Scanner;
import javax.swing.JOptionPane;

public class Alunos {
    public static void main(String[] args)throws Exception{
        //Escreva um programa que leia 4 notas de um aluno e calcule sua média
        Scanner scan =new Scanner(System.in);//cria-se objeto da classe scanner pra receber dados do usuário
        //declarar variáveis
        double nota1,nota2,nota3,nota4,media,frequencia;

        System.out.println("Insira a 1ª nota : ");
        nota1=scan.nextDouble();
        System.out.println("Insira a 2ª nota: ");
        nota2=scan.nextDouble();
        System.out.println("Insira a 3ª nota: ");
        nota3=scan.nextDouble();
        System.out.println("Insira a 4ª nota: ");
        nota4=scan.nextDouble();
        scan.close();
        System.out.println("Insira a frequência: ");
        frequencia=scan.nextDouble();
        scan.close();


        media= (nota1+nota2+nota3+nota4)/4;
        JOptionPane.showMessageDialog(null, "A média do aluno é de "+media, "Média do aluno",1);

        if((media<5) || (frequencia<0.75)){
          JOptionPane.showMessageDialog(null, "Sinto muito ): Aluno reprovado!"+media, "Situação do Aluno",1);
        }
        else{
          JOptionPane.showMessageDialog(null, "Parabéns !! Aluno Aprovado!"+media, "Situação do Aluno",2);
        }
    }
    
}
