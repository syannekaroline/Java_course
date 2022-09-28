import javax.swing.JOptionPane;

public class CalculaVetor {
    public static void main(String[] args) {;
        Double A[]= new Double[5];
        Double B[]= new Double[5];
        
        for (int i = 0; i < 5; i++) {
            A[i]=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de A[" + i + "]"));

            if (i%2 == 0)
                B[i]=2*A[i];
            else
                B[i]=A[i]/2;
        }
        System.out.println("A[]:");
        for (Double valor:A)
            System.out.print(valor+"\t");
        System.out.println("\nB[]:");
        for(Double valor:B) 
            System.out.print(valor+"\t");
    }
}
