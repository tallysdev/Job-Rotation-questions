package Questions;

import java.util.Scanner;

public class Question2 {

    static Scanner sc = new Scanner(System.in);

    public static void resolution() {
        System.out.println("Questão 2");
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
        if (num != fibonacci) {
            System.out.println(num + " Não está na sequência de Fibonacci \n");
        }
    }
}