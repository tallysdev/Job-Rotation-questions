import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        question1();
        question2();
    }

    public static void question1() {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K++;
            SOMA += K;
        }
        System.out.println("O valor de SOMA é " + SOMA);
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
                System.out.println(num + " Está na sequência de Fibonacci");
                break;
            }  
        }
        if (num != fibonacci){
            System.out.println(num + " Não está na sequência de Fibonacci");
        }
    }
}

