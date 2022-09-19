package unidade2;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class exercicio3 {

    public static void main (String[] args) throws Exception{
        //elaborar um programa que leia um numero inteiro. Informar os numeros anterior e posterior.
        //declarar variaveis
        int numero;
        //receber o numero do usuário
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        numero=scan.nextInt();
        scan.close();
        JOptionPane.showMessageDialog(null, "Número anterior a "+numero+" : "+(numero-1)+"\nNúmero posterior a "+numero+": "+(numero+1), "Exercício 3", 1);
        //dúvida -> quando eu não uso o parênteses em (numero+1) ele considera o numero como uma string por exemplo se o numero for 2 então 2+1 fica 21 mas se eu fizer (numero+1) fica 3. pq isso acontece se eu declarei o numero como um inteiro?

    }
    
}
