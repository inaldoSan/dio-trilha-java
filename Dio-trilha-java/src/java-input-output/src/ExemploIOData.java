import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExemploIOData {
    public static void incluirProduto() throws IOException {

        File f = new File("");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

        /* OutputStream os = new FileOutputStream(f.getPath());
        DataOutputStream dos = new DataOutputStream(os);
        */
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner scan = new Scanner(System.in);
        
        ps.println("Nome da peça: ");
        String nome = scan.nextLine();
        dos.writeUTF(nome);
        ps.println("Tamanho da peça: (P/M/G) ");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);
        
        ps.println("Qauntidade: ");
        int quantidade = scan.nextInt();
        dos.writeInt(quantidade);

        ps.println("Preço: ");
        double preco = scan.nextDouble();
        dos.writeDouble(preco);

        lerProduto(f.getPath());

        dos.close();
        scan.close();
        ps.close();
    }
    public static void lerProduto(String arquivo) throws IOException{

        File f = new File(arquivo);

        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));
        
        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.println(nome);
        System.out.println(tamanho);
        System.out.println(quantidade);
        System.out.println(preco);

        dis.close();
        

    }

    public static void main(String[] args) throws IOException {
        incluirProduto();
    }
}
