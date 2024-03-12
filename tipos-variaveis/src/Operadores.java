public class Operadores {
    public static void main(String[] args) {
        /*
        Operadores Aritméticos:
        São usados para realizar operações matemáticas básicas.
         */
        int a = 10;
        int b = 5;
        System.out.println(a + b); // Soma
        System.out.println(a - b); // Subtração
        System.out.println(a * b); // Multiplicação
        System.out.println(a / b); // Divisão
        System.out.println(a % b); // Resto da divisão


        /*  
        Operadores Unários:
        Requerem apenas um operando. 
        */
        int x = 10;
        System.out.println(x++); // 10 (pós-incremento)
        System.out.println(++x); // 12 (pré-incremento)
        System.out.println(~x); // Inverte os bits (complemento de 2)
        System.out.println(!true); // false (negação lógica)
        

        /*
        Operadores de Atribuição:
        Usados para atribuir valores a variáveis. 
        */
        int y = 20;
        y += 5; // y = y + 5
        y -= 3; // y = y - 3


        /*
        Operadores Relacionais:
        Comparação entre valores.
         */
        int p = 15;
        int q = 10;
        System.out.println(p > q); // true
        System.out.println(p == q); // false


        /* 
        Operadores Lógicos:
        Usados para combinar expressões booleanas. 
        */ 
        boolean r = true;
        boolean s = false;
        System.out.println(r && s); // false (AND lógico)
        System.out.println(r || s); // true (OR lógico)

        
        /* 
        Operador Ternário:
        Uma forma concisa de expressar uma condição.
         */
        int idade = 18;
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(status);
        

        /*
        Operadores de Deslocamento:
        Realizam deslocamento de bits. 
        */
        int num = 10;
        System.out.println(num << 2); // Deslocamento à esquerda (10 * 2^2 = 40)


    }
}
