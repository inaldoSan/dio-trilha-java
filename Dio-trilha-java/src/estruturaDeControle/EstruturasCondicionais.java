package estruturaDeControle;
public class EstruturasCondicionais {
    public static void main(String[] args) {


        double saldo = 25.0;
        double valorSolicitado = 17.0;
        
        System.out.println(saldoRestante(saldo, valorSolicitado));

        int nota = 6;
        System.out.println(resultadoAprovacao(nota));

        System.out.println(resultadoAprovacaoEncadeada(nota));

        int nota1 = 7;
        System.out.println(resultadoTernarioCenario1(nota1));

        int nota2 = 6;
        System.out.println(resultadoTernarioCenario2(nota2));
    }

    
    //Condicional simples
    public static double saldoRestante(double saldo, double valorSolicitado) {
        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        
        return saldo;
    }
    //Condicional Composta
    public static String resultadoAprovacao(int nota) {
        if (nota >= 7)
            return "Aprovado";
        else
            return "Reprovado";
    }
    //Condicional Encadeada
    public static String resultadoAprovacaoEncadeada(int nota) {
        if (nota >= 7)
            return "Aprovado";
        else if (nota >= 5 && nota < 7)
            return "Recuperação";
        else
            return "Reprovado";
    }
    //Condicional Ternária 
    public static String resultadoTernarioCenario1(int nota) {
        return nota >= 7 ? "Aprovado" : "Reprovado";
    }
    //Condicional Ternária 
    public static String resultadoTernarioCenario2(int nota) {
        return nota >= 7 ? "Aprovado" : (nota >= 5 && nota < 7) ? "Recuperação" : "Reprovado";
    }
}
