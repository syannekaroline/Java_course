package unidade2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[] args)throws Exception{
        //Escrever um programa pra uma pizzaria que leia o valor total de uma conta e quantos clientes vão pagá-la. Calcule e informe o valor a ser pago por cada cliente.
        Scanner scan =new Scanner(System.in);//cria-se objeto da classe scanner pra receber dados do usuário
        
        //declarar valores
        double ValorConta,ValorCliente;
        int NumeroClientes;

        //receber dados 
        System.out.println("Qual o valor total da conta em reais? ");
        ValorConta= scan.nextDouble();
        System.out.println("A conta será dividida por quantos clientes? ");
        NumeroClientes=scan.nextInt();
        scan.close();

        //calcular o valor por cliente
        ValorCliente=ValorConta/NumeroClientes;

        //Informar o valor pago por cada cliente
        JOptionPane.showMessageDialog(null,"Cada cliente deverá pagar R$"+ValorCliente, "Valor por cliente - Pizzaria", 1);

    }
}
