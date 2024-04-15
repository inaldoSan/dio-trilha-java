import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Exer_3 {

    public static void copiarArquivo() throws IOException {
        File f = new File("C:\\Users\\inald\\OneDrive\\Documentos\\dio-trilha-java\\java-input-output\\recomendacoes.txt");
        String nameArquivo = f.getName();
        /*
         
        FileReader r = new FileReader(nameArquivo);
        BufferedReader br = new BufferedReader(r);
        */
        
        BufferedReader br = new BufferedReader(new FileReader(nameArquivo));
        String line = br.readLine()
;
        String nameArquivoCopy = nameArquivo.substring(0, nameArquivo.indexOf(".")).concat("-copy.txt");

        File fcopy = new File(nameArquivoCopy);
        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
            
        } while (!(line == null));
        System.out.println("Arquivo "+ f.getName() +" copiado com sucesso!");

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();

        adicionarInfoNoArquivo(fcopy.getName());

        pw.println("Ok !");
        br.close();
        bw.close();
        pw.close();

    }

    public static void adicionarInfoNoArquivo(String arquivo) throws IOException{  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
        
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.equalsIgnoreCase("fim")));

    }


}
