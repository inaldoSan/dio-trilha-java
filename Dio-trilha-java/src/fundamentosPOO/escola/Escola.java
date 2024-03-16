package fundamentosPOO.escola;

public class Escola {
	public static void main(String[] args) {
		Aluno inaldo = new Aluno();
        inaldo.setIdade(8);
        inaldo.setNome("inaldo gonçalves");
        System.out.println("Sua idade:" + inaldo.getIdade() + " Seu nome:"+ inaldo.getNome());
	}
}