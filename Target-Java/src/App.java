import java.util.Scanner;

import javax.swing.SpinnerDateModel;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        question1();
        question2();
        question3();
        question4();
        question5();
    }

    public static void question1() {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K++;
            SOMA += K;
        }
        System.out.println("O valor de SOMA é " + SOMA + "\n");
    }

    public static void question2() {
        System.out.println("informe qual numero voce quer conferir na sequência de Fibonacci");
        int num = sc.nextInt();
        int anterior = 0;
        int proximo = 1;
        int fibonacci = 0;
        for (int i = 0; i <= num; i++) {
            fibonacci = anterior + proximo;
            anterior = proximo;
            proximo = fibonacci;
            if (fibonacci == num) {
                System.out.println(num + " Está na sequência de Fibonacci\n");
                break;
            }  
        }
        if (num != fibonacci){
            System.out.println(num + " Não está na sequência de Fibonacci \n");
        }
    }

    public static void question3() {
        System.out.println("a) 1, 3, 5, 7, 11");
        System.out.println("b) 2, 4, 8, 16, 32, 64, 128");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, 49");
        System.out.println("d) 4, 16, 36, 64, 100");
        System.out.println("e) 1, 1, 2, 3, 5, 8, 13");
        System.out.println("f) 2,10, 12, 16, 17, 18, 19, 200");
    }

    public static void question4() {
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
    
    public static void question5() {
        String tallys = "tallys";
        System.out.println(tallys);
        for (int i = (tallys.length() - 1); i >=0; i--) {
            char each = tallys.charAt(i);
            System.out.print(each);
            
        }
    }
}
