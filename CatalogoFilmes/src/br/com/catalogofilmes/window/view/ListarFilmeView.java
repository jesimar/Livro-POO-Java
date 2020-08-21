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
 * Classe listar produto
 * @author Antonio, Jesimar e Talles
 */
public class ListarFilmeView extends JPanel{
    
    private final JScrollPane jScrollPane = new JScrollPane();

    private final JTable jTable = new JTable();

    private int ammountProduto;

    public ListarFilmeView(){
        this.setLayout(null);
        this.setBounds(50, 50, 1000, 900);
    }

    /**
     * Listar produto
     */
    private void listarProduto(){

        this.setPreferredSize(new java.awt.Dimension(1024, 700));

        jTable.setModel(new DefaultTableModel(

            new String [] {
                "Codigo","Titulo", "Diretor", "Ano", "Gênero"
            },
            ammountProduto
        ));

        jTable.getColumnModel().getColumn(0).setWidth(0);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(100);

        jScrollPane.setViewportView(jTable);
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable.setFillsViewportHeight(true);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setBounds(0, 0, 1000, 600);
        this.add(jScrollPane);
    }

    /**
     * Listar produto
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
                jTable.setValueAt(filme.getCodigo(), i, 0);
                jTable.setValueAt(filme.getTitulo(), i, 1);
                jTable.setValueAt(filme.getDiretor(), i, 2);
                jTable.setValueAt(filme.getAno(), i, 3);
                jTable.setValueAt(filme.getGenero(), i, 4);
                i++;
            }
        } catch (Exception ex) {
            Logger.getLogger(ListarFilmeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Listar show
     */
    private void listarShowString(){
        this.setPreferredSize(new java.awt.Dimension(1024, 700));

        jTable.setModel(new DefaultTableModel(

            new String [] {
                "Codigo","Titulo", "Ano", "Gênero"
            },
            ammountProduto
        ));

        jTable.getColumnModel().getColumn(0).setWidth(0);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(60);

        jTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(200);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(150);

        jScrollPane.setViewportView(jTable);
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable.setFillsViewportHeight(true);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setBounds(0, 0, 1000, 600);
        this.add(jScrollPane);
    }

    /**
     * Listar show
     */
    public void listarShow(){
        try{
            List lista = new ArrayList();
            lista = retornarDados();
            listarShowString();
            Iterator it = lista.iterator();
            int i = 0;
            while (it.hasNext()) {
                Filme show = (Filme) it.next();
                jTable.setValueAt(show.getCodigo(), i, 0);
                jTable.setValueAt(show.getTitulo(), i, 1);
                jTable.setValueAt(show.getAno(), i, 2);
                jTable.setValueAt(show.getGenero(), i, 3);
                i++;
            }
        } catch (Exception ex) {
            Logger.getLogger(ListarFilmeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Retornar dados
     */
    private List retornarDados() throws ClassNotFoundException, SQLException{

        List lista= new ArrayList();
        ResultSet resultSet = AcessoDAO.selectBanco("Produto");
        while (resultSet.next()) {
            Filme filme = new Filme();
            filme.setCodigo(Integer.parseInt(resultSet.getString("codigo")));
            filme.setTitulo(resultSet.getString("titulo"));
            filme.setGenero(resultSet.getString("genero"));
            filme.setAno(Integer.parseInt(resultSet.getString("ano")));
            filme.setDiretor(resultSet.getString("diretor"));
            lista.add(filme);
        }
        ammountProduto = lista.size();
        return lista;
   }

}
