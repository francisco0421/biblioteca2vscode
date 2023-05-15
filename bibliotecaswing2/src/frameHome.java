import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class frameHome extends JFrame implements ActionListener {
    private JButton buttonCatalogo;
    private JButton buttonRetirarDevolver;
    private JButton buttonCadastro;
    private JButton buttonLoja;
    private final Dados conteudo = new Dados();
    private frameHome frameHome = new frameHome();
    private dialogCatalogo catalogo;
    private dialogRetirarDevolver emprestimos;

    public frameHome(){
        setTitle("Biblioteca");

        buttonCatalogo = new JButton("Catálogo");
        add(buttonCatalogo);
        buttonCatalogo.addActionListener(this);

        buttonRetirarDevolver = new JButton("Retirar / Devolver");
        add(buttonRetirarDevolver);
        buttonRetirarDevolver.addActionListener(this);

        buttonCadastro = new JButton("Cadastro");
        add(buttonCadastro);
        buttonCadastro.addActionListener(this);

        buttonLoja = new JButton("Loja");
        add(buttonLoja);
        buttonLoja.addActionListener(this);
    }

    public void actionPerformed(ActionEvent a){
        if (a.getSource() == buttonCatalogo) {
            dialogCatalogo catalogo = new dialogCatalogo(frameHome, conteudo);
        }
        if (a.getSource() == buttonRetirarDevolver) {
            dialogRetirarDevolver emprestimos = new dialogRetirarDevolver(frameHome, conteudo);
        }
        /*if (a.getSource() == buttonCadastro) {
            dialogCadastro cadastro = new dialogCadastro(frameHome, conteudo);
        }
        if (a.getSource() == buttonLoja) {
            dialogLoja loja = new dialogLoja(frameHome, conteudo);
        }*/
    }

    public static void main(String[] args) {
        frameHome frameHome = new frameHome();
        frameHome.setSize(800, 1000);
        frameHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameHome.setVisible(true);
    }
}