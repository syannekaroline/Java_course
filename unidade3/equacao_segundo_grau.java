import java.util.Scanner;

public class equacao_segundo_grau {
    public static void main(String[] args) throws Exception {
        int a,b,c;
        double delta,x1,x2;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o coeficiente a diferente de zero: ");
        a=scan.nextInt();
        if (a>0){
            System.out.println("Insira o coeficiente b: ");
            b=scan.nextInt();
            System.out.println("Insira o coeficiente c : ");
            c=scan.nextInt();
            scan.close();
            delta=Math.pow(b, 2) - 4*a*c;

            if (delta>0){
                x1= (-b+Math.sqrt(delta))/(2*a);
                x2= (-b-Math.sqrt(delta))/(2*a);
                System.out.println("As raízes são :"+x1+" e "+x2);
            }
            else if (delta<0){
                System.out.println("Não existem raizes reais");
            }
        }
        else{
            equacao_segundo_grau.main(null);
            scan.close();
        }
    }
}
