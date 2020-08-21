/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.catalogofilmes.window.view;

import br.com.catalogofilmes.dao.AcessoDAO;
import br.com.catalogofilmes.handler.Filme;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Classe pesquisar produto
 * @author Antonio, Jesimar e Talles
 */
public class PesquisarFilmeView extends JPanel{
    
    private JScrollPane jScrollPane = new JScrollPane();
    private JTable jTable = new JTable();
    private int ammountProduto;
    private String titulo;

    public PesquisarFilmeView(){
        this.setLayout(null);
        this.setBounds(50, 50, 1000, 900);
    }

    /**
     * Lista os produtos.
     */
    public void listar(){
        try{
            List lista = new ArrayList();
            lista = retornarDados();
            listarProduto();
            Iterator it = lista.iterator();
            int i = 0;
            while (it.hasNext()) {
                Filme filme = (Filme) it.next();
                if (titulo.equals(filme.getTitulo())){
                    jTable.setValueAt(filme.getTitulo(), i, 0);
                    jTable.setValueAt(filme.getDiretor(), i, 1);
                    jTable.setValueAt(filme.getAno(), i, 2);
                    jTable.setValueAt(filme.getGenero(), i, 3);
                }
                i++;
            }
        } catch (Exception ex) {
            Logger.getLogger(PesquisarFilmeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Lista os produtos da classe.
     */
    private void listarProduto(){
        this.setPreferredSize(new java.awt.Dimension(1024, 700));

        jTable.setModel(new DefaultTableModel(
            new String [] {
                "Titulo", "Diretor", "Ano", "Gênero"
            },
            ammountProduto
        ));

        jTable.getColumnModel().getColumn(0).setWidth(0);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(150);

        jScrollPane.setViewportView(jTable);
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable.setFillsViewportHeight(true);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setBounds(0, 0, 1000, 600);
        this.add(jScrollPane);
    }   

    /**
     * Retorna os dados do banco.
     */
    private List retornarDados() throws ClassNotFoundException, SQLException{

        List lista = new ArrayList();
        ResultSet resultSet = AcessoDAO.selectBanco("Produto", "titulo", titulo);
        while (resultSet.next()) {
            Filme filme = new Filme();
            filme.setTitulo(resultSet.getString("titulo"));
            filme.setGenero(resultSet.getString("genero"));
            filme.setAno(Integer.parseInt(resultSet.getString("ano")));
            filme.setDiretor(resultSet.getString("diretor"));
            lista.add(filme);
        }
        ammountProduto = lista.size();
        return lista;
   }

    /**
     * Lista os produtos do show
     */
    private void listarProdutoShow(){
        this.setPreferredSize(new java.awt.Dimension(1024, 700));

         jTable.setModel(new DefaultTableModel(

            new String [] {
                "Titulo", "Ano", "Gênero", "Artista", 
            },
            ammountProduto
        ));

        jTable.getColumnModel().getColumn(0).setWidth(0);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(100);

        jScrollPane.setViewportView(jTable);
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable.setFillsViewportHeight(true);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setBounds(0, 0, 1000, 600);
        this.add(jScrollPane);
    }

    /**
     * Lista os dados do show
     */
    public void listarShow(){
        try{
            List lista = new ArrayList();
            lista = retornarDadosShow();
            listarProdutoShow();
            Iterator it = lista.iterator();
            int i = 0;
            while (it.hasNext()) {
                Filme filme = (Filme) it.next();
                if (titulo.equals(filme.getTitulo())){
                    jTable.setValueAt(filme.getTitulo(), i, 0);
                    jTable.setValueAt(filme.getAno(), i, 2);
                    jTable.setValueAt(filme.getGenero(), i, 4);
                }
                i++;
            }
        } catch (Exception ex) {
            Logger.getLogger(PesquisarFilmeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Retorna os dados da pesquisa show.     
     */
    private List retornarDadosShow() throws ClassNotFoundException, SQLException{

        List lista = new ArrayList();
        ResultSet resultSet = AcessoDAO.selectBanco("Produto", "titulo", titulo);
        while (resultSet.next()) {
            Filme filme = new Filme();
            filme.setTitulo(resultSet.getString("titulo"));
            filme.setGenero(resultSet.getString("genero"));
            filme.setAno(Integer.parseInt(resultSet.getString("ano")));
            lista.add(filme);
        }
        ammountProduto = lista.size();
        return lista;
   }

    /**
     * Seta o titulo do produto.
     * @param titulo
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
