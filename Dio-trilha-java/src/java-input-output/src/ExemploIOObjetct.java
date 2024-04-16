import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExemploIOObjetct {
    public static void serealizacao() throws IOException{
        Pessoa pessoa = new Pessoa("inaldo", 12, 'M');

        File f = new File("pessoa");

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f.getName()));
        
        os.writeObject(pessoa);

        System.out.println("Arquivo : "+ f.getName()+ " Criado");

        os.close();
        
        
    }

    public static void desserealizacao(String arquivo) throws IOException, ClassNotFoundException{
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));

        Pessoa objectPessoa = (Pessoa) ois.readObject();

        System.out.println(objectPessoa.getNome() + " - " + objectPessoa.getIdade() + " - " + objectPessoa.getSexo());
        System.out.println(objectPessoa);
        ois.close();

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serealizacao();
        desserealizacao("\\Users\\inald\\OneDrive\\Documentos\\dio-trilha-java\\Dio-trilha-java\\src\\pessoa");
    }

}
