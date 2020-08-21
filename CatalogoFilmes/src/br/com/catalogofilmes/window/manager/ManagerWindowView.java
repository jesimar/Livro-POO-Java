/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.catalogofilmes.window.manager;

import br.com.catalogofilmes.window.view.FilmeView;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;

/**
 * Classe manager window
 * @author Antonio, Jesimar e Talles
 */
public class ManagerWindowView {

    public static JFrame window;   
    private JMenuBar jMenuBar;
    private JTabbedPane abas;
    private FilmeView filmes;

    /**
     * Contrutor da classe.
     */
    public ManagerWindowView(){
        filmes = new FilmeView();
        createWindow();
        createMenu();        
        createAbas();
        filmes.setAbas(abas);
        updateDimension();
    }

    /**
     * Cria a janela principal.
     */
    private void createWindow(){
        window = new JFrame("Catalogo de Filmes");
        window.setLayout(new FlowLayout(FlowLayout.CENTER, 6, 6));
        window.setSize(1024, 720);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.addWindowStateListener(new WindowStateListener() {
            public void windowStateChanged(WindowEvent e) {
                updateDimension();
            }
        });
    }

    private void createMenu(){
        jMenuBar = new JMenuBar();
        window.setJMenuBar(jMenuBar);
    }

    private void createAbas(){
        abas = new JTabbedPane();
        abas.addTab("Filmes", filmes);
        window.add(abas);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void repaintAbas(){
        abas.repaint();
    }

    public void updateDimension() {
        int w = window.getWidth();
        int h = window.getHeight() - 30;
        jMenuBar.setPreferredSize(new Dimension(w - 12, 30));
        abas.setPreferredSize(new Dimension(w - 24, h - 30 - 12));
        filmes.updateDimension(w - 36, h - 30 - 30 - 12);
    }
}
