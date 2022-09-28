public class MatrizIdentidade {
    public static void main(String[] args) throws Exception {
        int MatrizIdentidade[][]= new int[3][3];
        
        for (int i = 0; i < MatrizIdentidade.length; i++){
            for (int j = 0; j < MatrizIdentidade[0].length; j++){
              if(i==j)
                MatrizIdentidade[i][j]=1;
              else
                MatrizIdentidade[i][j]=0;
            }
        }
        for (int i = 0; i < MatrizIdentidade.length; i++){
            for (int j = 0; j < MatrizIdentidade[0].length; j++){
              System.out.print(MatrizIdentidade[i][j]+" ");
            }
            System.out.println();
        }
    }
}
