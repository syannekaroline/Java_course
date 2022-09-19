package unidade2;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class exercicio2 {
    public static void main (String[] args )throws Exception {
        //escreva um programa que leia a duração de uma viagem em dias e horas. Calcule e informe a duração total da viagem em número de horas.
        Scanner scan= new Scanner(System.in);
        int DuracaoViagem,dias,horas;
        System.out.println("Insira a duração da viagem em dias e horas :");
        System.out.println("Dias: ");
        dias= scan.nextInt();
        System.out.println("Horas: ");
        horas=scan.nextInt();

        DuracaoViagem=dias*24+horas;
        JOptionPane.showMessageDialog(null, "Duração da viagem em horas : "+DuracaoViagem+"H"," Duração de uma viagem",1);
        scan.close();
    }
    
}
