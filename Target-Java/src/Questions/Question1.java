package Questions;

public class Question1 {

    public static void resolution() {
        System.out.println("Questão 1");
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K++;
            SOMA += K;
        }
        System.out.println("O valor de SOMA é " + SOMA + "\n");
    }

}