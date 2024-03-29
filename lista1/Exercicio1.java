package lista1;
import java.util.Scanner;

public class Exercicio1 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        System.out.print("Digite o primeiro valor: ");
        int valor = scan.nextInt();
        soma += valor;
        System.out.print("Digite o segundo valor: ");
        soma += valor;
        valor = scan.nextInt();
        System.out.print("Digite o terceiro valor: ");
        soma += valor;
        valor = scan.nextInt();
        double media = soma / 3;
        System.out.println("A media dos valores é: "+ media);
        scan.close();
        }
        }
