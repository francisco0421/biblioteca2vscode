import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    public final String nome;
    public final List<Livro> livros;
    public int idCounter = 0;

    public Biblioteca(String nome, String livros){
        this.nome = nome;
        this.livros = new ArrayList<>();
    }
    
    public void addLivro(Livro livro){
        livro.setId(++this.idCounter);
        this.livros.add(livro);
    }
    
    public void removeLivro(Livro livro){
        this.livros.remove(livro);
    }
    
    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}