package prova3;
//Nagibe Santos Wanus Junior.

import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Estante> Estantes = new ArrayList<Estante>();
    int cont = 0;

    public void criarEstante(String assunto) {

        Estante estante = new Estante(assunto);
        Estantes.add(estante);
        System.out.println("A estante foi criada.");

    }

    public void criarEstante(Estante estante) {
        Estantes.add(estante);
        System.out.println("A estante foi criada.");
    }

    public void insiraLivro(String assunto, Livro lvr)
            throws LivroRepetidoException, FaltaEstanteException {

        boolean aux = true;

        for (Estante estante : Estantes) {
            if (estante.assunto.compareTo(assunto) == 0) {
                aux = false;
                estante.insiraLivro(lvr);

                break;
            }
            if (aux == true) {
                throw new FaltaEstanteException("Falta Estante !!");
            }
        }
    }

    public void insiraLivro(Estante estant, Livro lvr)
            throws LivroRepetidoException, FaltaEstanteException {

        boolean aux = true;

        for (Estante estante : Estantes) {
            if (estante.equals(estant)) {
                aux = false;
                estante.insiraLivro(lvr);

                break;
            }
        }

        if (aux == true) {
            throw new FaltaEstanteException("Falta criar uma estante!!");
        }
    }

    public void removerLivro(Livro lvr) {

        for (Estante estante : Estantes) {
            for (Livro livro : estante.Livros) {

                if (livro.equals(lvr)) {
                    estante.removaLivro(livro);
                    break;
                }
            }
        }
    } // procura em todos os estantes

    public void listarAcervo() {

        int contEstante = 1;
        for (Estante estante : Estantes) {
            
            System.out.println("Estante: "+ contEstante);
            System.out.println(estante.assunto);
            System.out.println();

            for (Livro livro : estante.Livros) {
                System.out.println("Titulo: " + livro.titulo + " Autor: " + livro.autor + " Ano: " + livro.ano);
                cont++;
            }
            contEstante++;
        }
    } // lista todos os estantes estant seus
}
