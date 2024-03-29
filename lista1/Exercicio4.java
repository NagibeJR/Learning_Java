package lista1;
import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        String leitura = JOptionPane.showInputDialog("Valor");
        int lado1 = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog("Valor");
        int lado2 = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog("Valor");
        int lado3 = Integer.parseInt(leitura);
        if (lado1 == lado2 && lado2 == lado3) {
        
        JOptionPane.showMessageDialog(null, "Triângulo equilatéro");
        }
        else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            JOptionPane.showMessageDialog(null, "Triângulo isoceles");
        }
        else{
            JOptionPane.showMessageDialog(null, "Triângulo escaleno");
        }
    }
}