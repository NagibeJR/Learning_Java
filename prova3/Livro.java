package prova3;
//Nagibe Santos Wanus Junior.

public class Livro {

    protected String titulo = "";
    protected String autor = "";
    public int ano = 0;

    public Livro(String titulo, String autor, int ano) {

        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;

    }

    @Override
    public boolean equals(Object obj) {

        boolean retorno = false;
        if ((obj != null) && (obj instanceof Livro)) {
            Livro Livro = (Livro) obj;
            if (this.titulo == Livro.titulo) {
                retorno = true;
            }
        }
        return retorno;
    }
}
