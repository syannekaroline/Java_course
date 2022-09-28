import javax.swing.JOptionPane;

public class IdadeNadador {
    public static void main(String[] args){
        int idade;
        String classificacao;
        idade=Integer.parseInt(JOptionPane.showInputDialog("Insira uma idade: "));

        if(idade<=5)
            classificacao = "Infantil A";
        else if (idade>=6 && idade<=8)
            classificacao="Infantil B";
        else if (idade>=9 && idade<=11)
            classificacao="Infncil C";
        else if (idade>=12 && idade<=13)
            classificacao="Juvenil A";
        else if (idade>=14 && idade<=17)
        classificacao="Juvenil B";
        else
            classificacao="Adulto";
        
        JOptionPane.showMessageDialog(null, "A classificação dessa idade é :"+classificacao,"Idade de um Nadador", 2);
    }
}
