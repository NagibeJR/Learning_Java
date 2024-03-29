package lista1;
import javax.swing.JOptionPane;
public class Exercicio2 {
 public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionario: ");
        String salariolido = JOptionPane.showInputDialog("Digite o valor do salario bruto: ");
        float salario = Integer.parseInt(salariolido);
        String descontolido = JOptionPane.showInputDialog("Digite o valor de desconto: ");
        float desconto = Integer.parseInt(descontolido);
        float liquido = salario - desconto;
        System.out.println(nome+": R$"+liquido);
    }
    
}
