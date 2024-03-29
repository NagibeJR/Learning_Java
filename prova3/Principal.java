package prova3;
//Nagibe Santos Wanus Junior.

public class Principal {
    public static void main(String[] args) {

        Biblioteca Livraria = new Biblioteca();// Biblioteca criada
        Estante estante1 = new Estante();// Estante criada
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "JK Rowling", 1997);
        Livro livro2 = new Livro("Percy Jackson O Ladrao de Raios", "Rick Riordan", 2005);
        Livro livro3 = new Livro("Percy Jackson O Mar de Monstros", "Rick Riordan", 2006);
        Livro livro4 = new Livro("The Legends Of Zelda", "Akira Himekawa", 2018);
        Livro livro5 = new Livro("Berserk", "Kentaro Miura", 1990);
        // Livros criados com suas informações

        try {
            estante1.insiraLivro(livro1);
        } catch (LivroRepetidoException e) {
            System.out.println(e.getMessage());
        } // Teste para inserir direto na prateleira marcada

        try {
            estante1.insiraLivro(livro2);
        } catch (LivroRepetidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            estante1.insiraLivro(livro3);
        } catch (LivroRepetidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            estante1.insiraLivro(livro4);
        } catch (LivroRepetidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            estante1.insiraLivro(livro5);
        } catch (LivroRepetidoException e) {
            System.out.println(e.getMessage());
        }

        Livro teste = estante1.livroMaisVelho();// Teste da função para ler o livro mais velho
        System.out.println();
        System.out.println("Livro mais velho: " + teste.titulo + "  Ano: " + teste.ano);
        System.out.println();

        estante1.removaLivro(livro2);// Teste para remover o livro

        estante1.listarLivros();// Listar livros da estantate selecionada

        Livraria.criarEstante("Estudos");// Teste de criação de estantes na livraria
        Livraria.criarEstante(estante1);
        System.out.println();

        try {
            Livraria.insiraLivro("Estudos", livro2);
        } catch (FaltaEstanteException e) {
            System.out.println(e.getMessage());
        } catch (LivroRepetidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Livraria.insiraLivro("Codigos", livro1);
        } catch (FaltaEstanteException e) {
            System.out.println(e.getMessage());
        } catch (LivroRepetidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Livraria.insiraLivro(estante1, livro5);
        } catch (FaltaEstanteException e) {
            System.out.println(e.getMessage());
        } catch (LivroRepetidoException e) {
            System.out.println(e.getMessage());
        }

        // Livraria.removerLivro(livro2);//Teste de remoção de livro na Biblioteca

        Livraria.listarAcervo();// Teste para listar todas as pra teleiras da livraria com seus livros

    }
}
