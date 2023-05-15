import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class dialogCatalogo extends javax.swing.JDialog {
    JTable tableCatalogo;
    JLabel labelCodigo;
    JLabel labelTitulo;
    JLabel labelAutor;
    JLabel labelCategoria;
    JScrollPane scrollPaneCatalogo;
    JTextField textFieldCodigo;
    JTextField textFieldTitulo;
    JTextField textFieldAutor;
    JTextField textFieldCategoria;
    JButton buttonAdicionar;
    JButton buttonRemover;
    public static Dados conteudo;

    public dialogCatalogo(java.awt.Frame frameHome, Dados conteudo){
        super(frameHome);
        //initComponents();
    }



    /*private void initComponents() {
        scrollPaneCatalogo = new javax.swing.JScrollPane();
        labelCodigo = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldTitulo = new javax.swing.JTextField();
        textFieldAutor = new javax.swing.JTextField();
        textFieldCategoria = new javax.swing.JTextField();
        buttonAdicionar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Título", "Autor", "Categoria", "Disponível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPaneCatalogo.setViewportView(tableCatalogo);

        labelCodigo.setText("Código");

        labelTitulo.setText("Título");

        labelAutor.setText("Autor");

        labelCategoria.setText("Categoria");

        /*textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });*/

        /*buttonAdicionar.setText("Adicionar");

        buttonRemover.setText("Remover");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneCatalogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCodigo)
                                    .addComponent(labelTitulo)
                                    .addComponent(labelAutor))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldAutor)
                                    .addComponent(textFieldTitulo)
                                    .addComponent(textFieldCodigo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldCategoria))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutor)
                    .addComponent(textFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCategoria)
                    .addComponent(labelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdicionar)
                    .addComponent(buttonRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }*/



    public static void main (String args[]){
        dialogCatalogo dialogCatalogo = new dialogCatalogo(null, conteudo);
        dialogCatalogo.setSize(800, 1000);
        dialogCatalogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dialogCatalogo.setVisible(true);
    }
}