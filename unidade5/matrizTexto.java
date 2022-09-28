import java.io.*;
public class matrizTexto {
    public static void main(String[] args) throws Exception {
        int MatrizIdentidade[][]= new int[3][3];

        FileWriter arq = new FileWriter("Matriz.txt");
        PrintWriter gravaarq = new PrintWriter(arq);
        gravaarq.println("=Matriz Identidade=");
        for (int i = 0; i < MatrizIdentidade.length; i++){
            for (int j = 0; j < MatrizIdentidade[0].length; j++){
              if(i==j)
                MatrizIdentidade[i][j]=1;
              else
                MatrizIdentidade[i][j]=0;
            }
        }
        for (int i = 0; i < MatrizIdentidade.length; i++){
            gravaarq.print("\t");
            for (int j = 0; j < MatrizIdentidade[0].length; j++){
              gravaarq.print("|"+MatrizIdentidade[i][j]+"|");
            }
            gravaarq.println();
        }
        gravaarq.close();
        arq.close();
    }
}
