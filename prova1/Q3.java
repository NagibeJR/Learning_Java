package prova1;

import java.util.Scanner;

//Nagibe Santos Wanus Junior.
public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int num1;
        num1 = scan.nextInt();

        System.out.print("Digite o segundo valor: ");
        int num2;
        num2 = scan.nextInt();

        int resto1 = 0, resto2 = 0;
        int cont1 = 1, cont2 = 1;

        while (num1 > cont1) {
            if (num1 % cont1 == 0) {
                resto1 = resto1 + cont1;
            }
            cont1++;
        }

        while (num2 > cont2) {
            if (num2 % cont2 == 0) {
                resto2 = resto2 + cont2;
            }
            cont2++;
        }

        if (resto1 == num2 && resto2 == num1) {
            System.out.println("Sao numeros amigos");
        } else
            System.out.print("Não sao numeros amigos");

        scan.close();
    }
}
