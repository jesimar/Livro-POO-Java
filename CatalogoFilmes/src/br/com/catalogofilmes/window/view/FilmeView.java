/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.catalogofilmes.window.view;

import br.com.catalogofilmes.dao.AcessoDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * Classe produto
 * @author Antonio, Jesimar e Talles
 */
public class FilmeView extends JPanel{

    private final ListarFilmeView listar;    
    private final IncluirFilmeView incluir;
    private final PesquisarFilmeView pesquisar;
    private final EditarFilmeView editar;

    private JPanel panelButtons;

    private JTabbedPane abas;
    
    public FilmeView(){
        listar = new ListarFilmeView();
        incluir = new IncluirFilmeView();
        pesquisar = new PesquisarFilmeView();
        editar = new EditarFilmeView();
        addPanels();
        addButtons();
    }

    /**
     * Seta as abas da tela produto
     */
    public void setAbas(JTabbedPane abas){
        this.abas = abas;
    }

    /**
     * Adiciona os paineis na tela produto
     */
    private void addPanels(){
        panelButtons = new JPanel();
        panelButtons.setLayout(new FlowLayout(FlowLayout.CENTER, 6, 6));
        panelButtons.setBackground(Color.LIGHT_GRAY);
        this.add(panelButtons);
    }

    /**
     * Adiciona 
     */
    private void addButtons(){
        final JPanel panel = this;
        JButton btnIncluir = new JButton("Incluir");
        btnIncluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.remove((listar));
                panel.remove((pesquisar));
                panel.remove(editar);
                panel.add(incluir);
                abas.repaint();
            }
        });
        panelButtons.add(btnIncluir);

        JButton btnEditar = new JButton("Editar");
        btnEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String codigo = JOptionPane.showInputDialog(null, "Entrada",
                        "Digite o codigo do produto", JOptionPane.INFORMATION_MESSAGE);
                
                if (codigo != null){
                    int cod = Integer.parseInt(codigo);
                    panel.remove(incluir);
                    panel.remove(listar);
                    panel.remove(pesquisar);
                    editar.editar(cod);
                    panel.add(editar);
                    abas.repaint();
                }
            }
        });
        panelButtons.add(btnEditar);

        JButton btnDeletar = new JButton("Deletar");
        btnDeletar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String codStr = JOptionPane.showInputDialog(null, 
                        "Digite o código do Produto", "Entrada",
                        JOptionPane.INFORMATION_MESSAGE);
                
                if (codStr != null  && !codStr.equals("")){
                    int cod = Integer.parseInt(codStr);
                    try {
                        AcessoDAO.deletarBancoProduto(cod);
                    } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null,
                                    "Código não encontrado");
                    }
                }
            }
        });
        panelButtons.add(btnDeletar);

        JButton btnListar = new JButton("Listar");
        btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.remove((incluir));
                panel.remove((pesquisar));
                panel.remove(editar);
                panel.add(listar);
                listar.listar();
                abas.repaint();
            }
        });
        panelButtons.add(btnListar);

        JButton btnPesquisar = new JButton("Pesquisar");
        btnPesquisar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog(null, "Entrada",
                        "Digite o nome do produto", JOptionPane.INFORMATION_MESSAGE);

                panel.remove((incluir));
                panel.remove((listar));
                panel.remove(editar);
                pesquisar.setTitulo(nome);
                panel.add(pesquisar);
                pesquisar.listar();
                abas.repaint();
            }
        });
        panelButtons.add(btnPesquisar);
    }

    /**
     * Atualiza as dimensões da janela
     */
    public void updateDimension(int w, int h){
        int wD = w-12;
        int hD = h-58;
        incluir.updateDimension(wD, hD);
        editar.updateDimension(wD, hD);
        panelButtons.setPreferredSize(new Dimension(wD, 40));
    }
}
