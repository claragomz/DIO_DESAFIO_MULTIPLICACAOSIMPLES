package dio.multiplicacao.simples;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int A, B, PROD;

            int a = sc.nextInt();
            int b = sc.nextInt();

            PROD = a * b;


            System.out.println("PROD = " + PROD);
        }
    }
