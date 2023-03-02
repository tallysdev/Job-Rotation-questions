package Questions;

public class Question4 {

    public static void resolution() {
        System.out.println("\nQuestão 4");
        double distanciaTotal = 100;
        double velocidadeCarro = 110;
        double velocidadeCaminhao = 80;
        double tempoPedagio = 5.0 / 60.0;

        double x = (velocidadeCarro * distanciaTotal) / (velocidadeCarro + velocidadeCaminhao);

        double distanciaCaminhao = distanciaTotal - x;
        double tempoPedagioCaminhao = 2 * tempoPedagio;
        distanciaCaminhao -= tempoPedagioCaminhao * velocidadeCaminhao;

        double distanciaCarro = x;

        double distanciaCaminhaoFranca = distanciaTotal - x + (2 * tempoPedagioCaminhao * velocidadeCaminhao) / 60.0;

        if (distanciaCarro < distanciaCaminhaoFranca) {
            System.out.println("O carro está mais próximo de Ribeirão Preto no momento do encontro.");
        } else {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto no momento do encontro.");
        }
    }
}