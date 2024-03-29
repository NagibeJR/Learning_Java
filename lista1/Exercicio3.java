package lista1;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a nota: ");
        int nota = scan.nextInt();
        if (nota >= 7 && nota <= 10){
            System.out.println("Passou direto.");
        }
        else if (nota < 7 && nota >= 5){
            System.out.println("Tem direito a fazer uma prova de reculperação.");
        }
        else if (nota < 5){
            System.out.println("Reprovado direto.");
        }
        else{
            System.out.println("Numero incorreto.");
        }
        scan.close();
    }
    
}
