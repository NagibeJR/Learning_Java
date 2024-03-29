package prova1;

import java.util.Scanner;

//Nagibe Santos Wanus Junior.
public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a ser lidos: ");
        int TAM = scan.nextInt();
        int vetor[] = new int[TAM];
        System.out.println("Digite os valores: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scan.nextInt();
        }
        System.out.print("Vetor compactado: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != -1) {
                System.out.print(vetor[i] + " ");
            }
        }
        scan.close();
    }
}
