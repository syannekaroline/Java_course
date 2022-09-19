package unidade2;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class exercicio1 {
    public static void main(String[] args) throws Exception {
        //Elaborar um programa que leia o valor de um jantar. Calcule e informe qual a valor da taxa do garçom (10%) e o valor total a ser pago.
        double ValorJantar, ValorPagamento,TxGarcom=0.1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor do jantar: ");
        ValorJantar=scan.nextDouble();
        TxGarcom=TxGarcom*ValorJantar;
        ValorPagamento=TxGarcom+ValorJantar;

        JOptionPane.showMessageDialog(null,"Valor correspondente à taxa do garçom : "+TxGarcom+"\nValor total a ser pago : "+ValorPagamento);
        scan.close();

    }
}
