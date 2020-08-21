package br.com.catalogofilmes.window.view;

import br.com.catalogofilmes.dao.AcessoDAO;
import br.com.catalogofilmes.handler.Filme;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Classe editar produto
 * @author Antonio, Jesimar e Talles
 */
public class EditarFilmeView extends JPanel{

    private String typeGenero[] = {"", "Ação", "Aventura", "Comédia", "Drama",
            "Ficção Científica", "Guerra", "Medieval", "Romance", "Suspense",
            "Terror", "Outra"};

    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;

    private JLabel labelTitulo;
    private JLabel labelDiretor;
    private JLabel labelYear;
    private JLabel labelGenero;
    
    private final JTextField fieldTitulo = new JTextField();
    private final JTextField fieldDiretor = new JTextField();
    private final JTextField fieldAno = new JTextField();
    
    private final JComboBox fieldGenero = new JComboBox(typeGenero);

    private int cod;

    /**
     * Construtor da classe editar produto
     */
    public EditarFilmeView(){
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 6, 6));
        initFields();
    }

    /**
     * Inicializa campos da interface grafica
     */
    private void initFields(){
        p1 = new JPanel();
        labelTitulo = new JLabel("   Titulo: ");
        p1.add(labelTitulo);

        fieldTitulo.setPreferredSize(new Dimension(200, 25));
        p1.add(fieldTitulo);
        this.add(p1);

        p2 = new JPanel();
        labelDiretor = new JLabel("   Diretor: ");
        p2.add(labelDiretor);

        fieldDiretor.setPreferredSize(new Dimension(200, 25));
        p2.add(fieldDiretor);
        this.add(p2);

        p3 = new JPanel();
        labelYear = new JLabel("   Ano: ");
        p3.add(labelYear);

        fieldAno.setPreferredSize(new Dimension(200, 25));
        p3.add(fieldAno);
        this.add(p3);
       
        p4 = new JPanel();
        labelGenero = new JLabel("   Gênero: ");
        p4.add(labelGenero);

        fieldGenero.setPreferredSize(new Dimension(200, 25));
        p4.add(fieldGenero);
        this.add(p4);        

        p5 = new JPanel();
        p5.setPreferredSize(new Dimension(1000, 100));
        JButton btnOk = new JButton("Ok");
        btnOk.setPreferredSize(new Dimension(100, 25));
        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    if (fieldAno.getText().equals("") ||
                            fieldDiretor.getText().equals("") ||
                            fieldTitulo.getText().equals("")  ||
                            fieldGenero.getSelectedIndex() == 0){

                        JOptionPane.showMessageDialog(null,
                                "Preencha todos os campos acima",
                                "Erro Edição",
                                JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        confEditar();
                    }
                } catch (Exception ex) {
                    Logger.getLogger(EditarFilmeView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        p5.add(btnOk);

        JButton btnClear = new JButton("Limpar");
        btnClear.setPreferredSize(new Dimension(100, 25));
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
        p5.add(btnClear);
        this.add(p5);
    }

    /**
     * Limpa os campos da interface grafica
     */
    private void clear(){
        fieldTitulo.setText("");
        fieldDiretor.setText("");
        fieldAno.setText("");
        fieldGenero.setSelectedIndex(0);
    }

    /**
     * Captura o texto do genero
     */
    private String getTextGenero(int text){
        String textGenero[] = {"", "Ação", "Aventura", "Comédia", "Drama",
            "Ficção Científica", "Guerra", "Medieval", "Romance", "Suspense",
            "Terror", "Outra"};

        return textGenero[text];
    }

    /**
     * Atualiza as dimensões da janela
     */
    public void updateDimension(int wD, int hD){
        this.setPreferredSize(new Dimension(wD, hD));
    }

    /**
     * Editar os campos do produto
     */
    public void editar(int codigo) {
        try {
            ResultSet resultSet = AcessoDAO.selectBanco("Produto", "codigo", codigo);
            this.cod = codigo;
            setFields(resultSet);

        } catch (SQLException ex) {
            Logger.getLogger(EditarFilmeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Configura os campos
     */
    private void setFields(ResultSet resultSet) throws SQLException{
        resultSet.beforeFirst();
        while(resultSet.next()) {
            fieldTitulo.setText(resultSet.getString("titulo"));
            fieldDiretor.setText(resultSet.getString("diretor"));
            fieldAno.setText(resultSet.getString("ano"));
            fieldGenero.setSelectedIndex(0);
        }
    }

    /**
     * Configura a edição
     */
    private void confEditar() throws SQLException {
        Filme produto = new Filme();
        produto.setTitulo(fieldTitulo.getText());
        produto.setDiretor(fieldDiretor.getText());
        produto.setAno(Integer.parseInt(fieldAno.getText()));
        produto.setGenero(getTextGenero(fieldGenero.getSelectedIndex()));
        produto.setCodigo(this.cod);
        AcessoDAO.editarBancoProduto(produto);
        JOptionPane.showMessageDialog(null, "Edição efetuado com sucesso",
                "Edição", JOptionPane.INFORMATION_MESSAGE);
    }
}
