public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        /**
         * Estudar:
         * Tipos primitivos
         * estudar a classe String que representa texto na aplicação;
         */

        String meuNome = "Ricardo Carvalho";

        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        System.out.println(numero);
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI);

    }
}
