package prova1;

import java.util.Scanner;

//Nagibe Santos Wanus Junior.
public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cliente = 0, pao = 0;
        int acumuloc = 0, acumulop = 0, contCM = 0, contCP = 0;
        float media, Pcliente, Ppao;

        do {
            System.out.print("Digite o total gasto pelo cliente: ");
            cliente = scan.nextInt();
            if (cliente != 0) {
                System.out.print("Digite o total com pão: ");
                pao = scan.nextInt();
            }
            if (cliente >= pao && cliente > 0 && pao > 0) {
                acumuloc += cliente;
                acumulop += pao;
                contCM++;
            } else {
                continue;
            }
            if (cliente > 25) {
                contCP++;
            }

            media = acumuloc / contCM;

            int resultC1, resultC2;
            resultC1 = contCP * 100;
            resultC2 = contCM;
            Pcliente = resultC1 / resultC2;

            int resultP1, resultP2;
            resultP1 = acumulop * 100;
            resultP2 = acumuloc;
            Ppao = resultP1 / resultP2;

            System.out.println("Média de gasto por cliente: R$" + media);
            System.out.println("Percentual de clientes que gastam mais que R$ 25,00: " + Pcliente + "%");
            System.out.println("Percentual gasto apenas com pão pelos clientes: " + Ppao + "%");

        } while (cliente != 0);
        scan.close();
    }
}