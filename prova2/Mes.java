package prova2;
//Nagibe Santos Wanus Junior.

public class Mes {

    protected int dia;
    protected int hora;
    protected int calendario[][] = new int[31][25];
    protected Compromisso Vcompromisso[][] = new Compromisso[31][25];
    protected int aux[] = new int[31];
    int Cont = 0;

    public void addCompromisso(Compromisso compromisso, int dia, int hora) {

        if (this.calendario[dia][hora] == 0) {

            this.Vcompromisso[dia][hora] = compromisso;
            this.calendario[dia][hora] = 1;

            System.out.println("O compromisso foi agendado com sucesso");

        } else {

            System.out.println("Houve problema de choque no" + dia + "e" + hora);

        }
    }

    public void addCompromissoDiario(Compromisso compromisso, int hora) {

        for (int i = 1; i <= 30; i++) {
            if (this.calendario[i][hora] == 0) {

                this.Vcompromisso[i][hora] = compromisso;
                this.calendario[i][hora] = 1;

            } else {

                aux[Cont] = i;
                Cont++;
            }
        }

        System.out.print("Houve um problema de choque no(s) dia(s): ");

        for (int i = 0; Cont > i; i++) {
            if (aux[i] != 0) {

                System.out.print(aux[i] + " ");
            }
        }
        System.out.println();
    }

    public void desmarcarCompromisso(int dia, int hora) {

        if (this.calendario[dia][hora] == 1) {

            this.Vcompromisso[dia][hora] = null;
            this.calendario[dia][hora] = 0;

            System.out.println("O compromisso foi desmarcado com sucesso");

        } else {

            System.out.println("Não tem compromisso nesse horario");

        }
    }

    public void desmarcarCompromissos(int dia) {

        for (int i = 0; i <= 24; i++) {

            if (this.calendario[dia][i] == 1) {

                this.Vcompromisso[dia][i] = null;
                this.calendario[dia][i] = 0;

            }
        }

         //System.out.println("O compromisso desmarcado com sucesso");

    }

    public void remarcarCompromisso(int diaOrigem, int horaOrigem, int diaDestino, int horaDestino) {

        this.Vcompromisso[diaDestino][horaDestino] = this.Vcompromisso[diaOrigem][horaOrigem];
        this.Vcompromisso[diaOrigem][horaOrigem] = null;
        this.calendario[diaOrigem][horaOrigem] = 0;
        this.calendario[diaDestino][horaDestino] = 1;

        if (this.calendario[diaOrigem][horaOrigem] == 1) {

            System.out.println("Não tem compromisso nesse horário");

        } else {

            System.out.println("O compromisso foi agendado com sucesso");

        }
    }

    public void listarAgenda() {

        int cont = 0;

        for (int i = 1; i <= 30; i++) {

            cont = i;

            for (int j = 0; j <= 24; j++) {

                if (this.calendario[i][j] == 1) {

                    if (cont == i) {

                        System.out.println("Dia " + i);

                        cont++;
                    }

                    System.out.println(" Hora " + j + ":00 ");
                    System.out.println(" Titulo: " + this.Vcompromisso[i][j].titulo);

                    if (this.Vcompromisso[i][j].convidado != null) {

                        System.out.println(" Convidado: " + this.Vcompromisso[i][j].convidado);

                    }
                    if (this.Vcompromisso[i][j].link != null) {

                        System.out.println(" Link da reunião: " + this.Vcompromisso[i][j].link);
                    }
                }
            }
        }
    }
}
