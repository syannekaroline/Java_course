package unidade2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercicio9 {
    public static void main(String[] args)throws Exception{
        //Elaborar um programa pra uma lanhouse, cujo o custo por 15 min de uso seja um constante de R$2.0, que leia o tempo que o cliente utilizou o computador e quanto ele deve pagar, sabendo que as frações extras de 15 min devem ser cobradas de forma integral.
        Scanner scan =new Scanner(System.in);//cria-se objeto da classe scanner pra receber dados do usuário

        double hours, min,Time;
        final int cost=2;

        System.out.println("Enter customer usage time.\nHours: ");
        hours=scan.nextDouble();
        System.out.println("Min: ");
        min=scan.nextDouble();
        scan.close();

        Time=(hours*60)+min;
        JOptionPane.showMessageDialog(null, "Total Cost: R$"+(Math.round(Time/15)*cost), "Lan House Cost", 1);

    }

}
