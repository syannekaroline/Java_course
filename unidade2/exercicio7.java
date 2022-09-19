package unidade2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercicio7 {
    public static void main(String[] args)throws Exception{
        //Elabore um programa para um vídeolocadore que leia o título e a duração de um filme em horas e minutos. Exibir o título do filme coma a sua duração apenas em minutos
        Scanner scan =new Scanner(System.in);//cria-se objeto da classe scanner pra receber dados do usuário

        //declarar variáveis
        String TituloFilme;
        int horas,min;

        //receber os dados
        System.out.println("Insira o título do Filme: ");
        TituloFilme=scan.nextLine();//scan.next(); deu erro... pq?? n sabo

        System.out.println("Insira os dados sobre a duração do filme em horas e minutos. \nHoras: ");
        horas=scan.nextInt();

        System.out.println("Minutos : ");
        min=scan.nextInt();
        scan.close();
        //informar dados pro usuário
        JOptionPane.showMessageDialog(null, "Título do filme : "+TituloFilme+"\nDuração em minutos: "+((horas*60)+min)+"min","Informações para a Videolocadora", 1);
    }
}
