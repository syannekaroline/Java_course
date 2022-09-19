package unidade2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercicio5 {
    public static void main(String[] args)throws Exception{

        //Elabore um programa pra uma loja que leia o preço de um produto e informe as duas opções de pagamento: à vista com 10% de desconto ou o mesmo valor em 3X
        Scanner scan =new Scanner(System.in);//cria-se objeto da classe scanner pra receber dados do usuário
             
        //declarar valores
        double PrecoProduto;
        final double desconto=0.1;
        //receber dados 
        System.out.println("Qual o preço do produto em reais? ");
        PrecoProduto=scan.nextDouble();
        scan.close();

        //informar as duas opções de pagamento de pagamento
        JOptionPane.showMessageDialog(null,"Opções de pagamento \nPagamento à vista: R$"+(PrecoProduto-(PrecoProduto*desconto))+"\nPagamento Parcelado : 3x de R$"+PrecoProduto/3, "Cálculo do valor de um produto", 1);

    } 
}
