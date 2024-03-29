package lista1;
import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        String leitura = JOptionPane.showInputDialog("Valor - 0 finaliza");
        int valor = Integer.parseInt(leitura);
        int maior = 0;
        int menor = 0;
        while (valor != 0) {
        if (valor < 0) {
        System.out.println("O valor digitado é menor que zero");
        }
        if (valor > maior)
        maior = valor;
        if (valor < menor)
        menor = valor;
        
        }
        System.out.println("O maior valor lido foi: " + maior);
        System.out.println("O menor valor lido foi: " + menor); 
    }
}
