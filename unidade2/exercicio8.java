package unidade2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercicio8 {
    public static void main(String[] args)throws Exception{
        //Escrever um programa pra uma revenda de veículos. O programa deve ler o modelo e o preço do Veículo. Apresentar como resposta o valor de entrada(50%) e o saldo restante em 12x sem juros
        Scanner scan =new Scanner(System.in);//cria-se objeto da classe scanner pra receber dados do usuário

        String Modelo;
        double preco;

        System.out.println("Insira o modelo do Veículo: ");
        Modelo = scan.nextLine();

        System.out.println("Insira o preço do Veículo em reais: ");
        preco= scan.nextDouble();
        scan.close();

        JOptionPane.showMessageDialog(null, "Valor de entrada: R$"+preco*0.5+"\nValor restante : 12x de R$"+((preco*0.5)/12),Modelo, 1);
    }

}
