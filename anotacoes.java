import java.util.Scanner;

public class App {//definição da classe e o nome dela 
    
    public static void main(String[] args) throws Exception {  //nome do método principal do java - padrão - tem prioridade na execução do código e declaração de argumento 
        String Nome = "Syanne Karoline Moreira Tavares";
        int idade=0;
        System.out.println("Hello, World!");
        System.out.println(Nome);
        System.out.println(idade);

        //declaração de variáveis - 8 tipos 
        /*Tipos de variáveis em java :
        byte - 8bits
        short 16 bits
        int   32 bits
        long  64 bits 
        float 32 bits
        double 64 bits
        boolean true/ false
        char ''
        final int (contante inteira)

        Identificadores:
        servem pra nomear as variáveis; podem conter letras e/ou       dígitos, "_" e "$";não podem ser iniciados por dígito;         não podem ser palavras reservadas; não tem tam max;

        Operações matemáticas e prioridades
        ** exponenciação; *Multiplicação; / divisão ; + soma ;- subtração ;

        operadores relacionais
        > maior que | < menor que 
        >= <=
        == igualdade != diferença
        ++ incremento
        -- decremento
        && - and
        || - or
        ! - não lógico
        ^ XOR
        += atribuição com adição
        -= atribuição com subtração
        /= atribuição com divisão
        %= atribuição com resto
        &= atribuição com and
        ? : operador ternário
        << Deslocamento à esquerda
        >> Deslocamento à direita 
        ....

        Blocos de código em java são representados por classes

        Comandos de entrada e saída
        Entrada de dados : duas linhas de código
        Scanner scn = new Scanner(System.in) - cria-se um objeto da classe scanner
        nome=scan.nextLine();
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu nome ?");
        Nome=scan.next();
        System.out.println("Seja bem-vindo(a) "+Nome);
        System.out.println("Quantos anos vc tem ? ");
        idade = scan.nextInt();
        System.out.println(Nome + " tem "+idade+" anos de idade!! que massa");
        scan.close();
    }
}
