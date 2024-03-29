package prova3;
//Nagibe Santos Wanus Junior.

import java.util.ArrayList;

public class Estante extends Biblioteca {

    public ArrayList<Livro> Livros = new ArrayList<Livro>();
    public int cont = 0;
    public String assunto = "";
    public int AnoInicial = 0;
    public int AnoFinal = 0;
    public int TAM = 0;

    public Estante(String assunto) {
        this.assunto = assunto;
    }

    public Estante() {
    }

    public void insiraLivro(Livro livro) throws LivroRepetidoException {

        boolean aux = true;

        for (Livro livroRecebido : Livros) {

            if (livro.equals(livroRecebido)) {
                aux = false;
                throw new LivroRepetidoException("Livro repetido !!");

            }
        }
        if (aux == true) {
            System.out.println("Livro cadastrado com sucesso.");
            cont++;
            Livros.add(livro);
        }
    }

    public boolean removaLivro(Livro livro) {

        if (Livros.size() > 0 && Livros.remove(livro)) {

            System.out.println("O livro foi Removido !!");
            System.out.println();
            return true;

        }
        return false;
    }

    public Livro livroMaisVelho() {

        Livro LivroOld = new Livro("EU", "NAGIBE", 3000);

        for (Livro livro : Livros) {
            if (livro != null) {
                if (LivroOld.ano > livro.ano) {
                    LivroOld = livro;
                }
            }
        }
        return LivroOld;
    } // – retorna o livro mais velho ou null caso não tenha nenhum livro

    public void listarLivros() {
        System.out.println();
        System.out.println("!! Lista de Livros !!");
        for (Livro livro : Livros) {

            if (livro != null) {

                System.out.println("Titulo: " + livro.titulo + " Autor: " + livro.autor + " Ano: " + livro.ano);

            }
        }
        System.out.println();
    } // – lista todos os livros do estante

    @Override
    public boolean equals(Object obj) {

        boolean retorno = false;
        if ((obj != null) && (obj instanceof Estante)) {
            Estante estante = (Estante) obj;
            if (this.assunto.compareTo(estante.assunto) == 0) {
                retorno = true;
            }
        }
        return retorno;
    }
}
