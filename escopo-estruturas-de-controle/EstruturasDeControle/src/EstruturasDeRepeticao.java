public class EstruturasDeRepeticao {    

    public static void main(String[] args) {
        //estrutura do controle de fluxo for
        // for (bloco de inicialização; expressão booleana de validação; bloco de atualização)

		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
    
        }

        // ExemploFor.java
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //Forma abreviada
	    for(String aluno : alunos) {
            System.out.println(aluno);
        }

        //Exemplo break
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
            
        }


        //Exemplo Continue

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
            
        }
    }

}
