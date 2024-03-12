public class Metodos {
    public static void main(String[] args) {
        // Exemplo de método simples
        saudacao();

        // Exemplo de método com parâmetros
        int resultadoSoma = soma(10, 5);
        System.out.println("Resultado da soma: " + resultadoSoma);

        // Exemplo de método com retorno
        double areaCirculo = calcularAreaCirculo(3.0);
        System.out.println("Área do círculo: " + areaCirculo);

        // Exemplo de método estático
        imprimirMensagem("Olá, mundo!");

        // Exemplo de método com sobrecarga
        int resultadoSomaInt = calcularSoma(10, 20);
        double resultadoSomaDouble = calcularSoma(10.5, 20.5);
        System.out.println("Soma int: " + resultadoSomaInt);
        System.out.println("Soma double: " + resultadoSomaDouble);
    }


    
    // Método simples
    public static void saudacao() {
        System.out.println("Olá, mundo!");
    }

    // Método com parâmetros
    public static int soma(int a, int b) {
        return a + b;
    }

    // Método com retorno
    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    // Método estático
    public static void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    // Método com sobrecarga
    public static int calcularSoma(int a, int b) {
        return a + b;
    }

    public static double calcularSoma(double a, double b) {
        return a + b;
    }
}
