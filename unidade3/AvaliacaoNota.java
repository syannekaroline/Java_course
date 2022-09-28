import javax.swing.JOptionPane;

public class AvaliacaoNota {   
  public static void main(String[] args) {
    int nota;
    String conceito;
    nota=Integer.parseInt(JOptionPane.showInputDialog("Insira a nota de 0 a 100: "));

    if(nota>0 && nota<=50)
      conceito = "Insuficiente";
    else if (nota>50 && nota<=70)
      conceito="Regular";
    else if (nota>70 && nota<=90)
      conceito="Bom";
    else
      conceito="Exelente";  
    JOptionPane.showMessageDialog(null, "O coneito dessa nota é :"+conceito,"Conceito de uma Nota", 2 );
  }
}
