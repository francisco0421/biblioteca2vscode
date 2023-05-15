import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dados {
    public Biblioteca biblioteca;

    public Dados(){
        initDados();
    }

    private void initDados() {
        this.biblioteca.addLivro(new Livro("Guerra e Paz","Liev Tolstói","Romance"));
        this.biblioteca.addLivro(new Livro("1889","Laurentino Gomes","História brasileira"));
        this.biblioteca.addLivro(new Livro("O Silmarillion","J.R.R. Tolkien","Fantasia"));
        this.biblioteca.addLivro(new Livro("Crime e Castigo","Fiódor Dostoiévski","Romance"));
        this.biblioteca.addLivro(new Livro("Fausto","J.W. Goethe","Poesia"));
    }

    public Biblioteca getBiblioteca(){
        return this.biblioteca;
    }
}
