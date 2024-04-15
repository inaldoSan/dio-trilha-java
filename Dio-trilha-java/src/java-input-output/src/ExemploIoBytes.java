import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExemploIoBytes {
    public static void copiarArquivo() throws IOException{
        File f = new File("\\Users\\inald\\OneDrive\\Documentos\\dio-trilha-java\\java-input-output");
        String nomeArquiuvo = f.getName();
       
        /*FileInputStream is = new FileInputStream(f.getName());
        BufferedInputStream bis = new BufferedInputStream(is);
        */
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f.getName()));

        String nomeArquivoCopy = nomeArquiuvo.substring(0, nomeArquiuvo.indexOf("-")).concat("-copy2.txt");

        File fcopy = new File(nomeArquivoCopy);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopy));

        int line = 0;
        while ((line= bis.read()) != -1) {
            bos.write((char) line);
            bos.flush();

        }
        bis.close();
        bos.close();


    }
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }

}
