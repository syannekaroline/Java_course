import java.io.*;
public class arquivo {
    public static void main(String[] args) throws Exception {
        String[] nomes ={"Syanne","Karoline","Moreira"};
        String[] fones ={"4002-8922","8888-3333","8887-5746"};
        String[] cidades ={"Mossoró","Apodi","Assu"};

        FileWriter arq = new FileWriter("contatos.txt");
        PrintWriter gravaarq = new PrintWriter(arq);

        gravaarq.println("================================");
        gravaarq.println("Nomes || Telefones || Cidades ");

        for (int i = 0; i < nomes.length; i ++) {
            gravaarq.println("================================");
            gravaarq.print(nomes[i]+" || ");
            gravaarq.print(fones[i]+" || ");
            gravaarq.println(cidades[i]);
        }
        gravaarq.println("================================");
        arq.close();
        gravaarq.close();
    }
}
