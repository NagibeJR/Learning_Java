package prova1;

//Nagibe Santos Wanus Junior.
public class Q4 {
    public static void main(String[] args) {

        int valor1 = 2000;
        int valor2 = 2000;
        int resto1 = 0, resto2 = 0;
        int cont1 = 1, cont2 = 1;
        int num1, num2;

        for (num1 = 0; num1 <= valor1; num1++) {
            while (num1 > cont1) {
                if (num1 % cont1 == 0) {
                    resto1 = resto1 + cont1;
                }
                cont1++;
            }
        }

        for (num2 = 0; num2 <= valor2; num2++) {
            while (num2 > cont2) {
                if (num2 % cont2 == 0) {
                    resto2 = resto2 + cont2;
                }
                cont2++;
            }
        }

        System.out.println(resto1 + " " + cont2);

    }
}
