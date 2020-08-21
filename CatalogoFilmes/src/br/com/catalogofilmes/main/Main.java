package br.com.catalogofilmes.main;

import br.com.catalogofilmes.dao.AcessoDAO;
import br.com.catalogofilmes.window.manager.ManagerWindowView;
import java.sql.SQLException;

/**
 * Classe main
 * @author Antonio, Jesimar e Talles
 */
public class Main {
        
    public static void main(String[] args) throws InterruptedException,
            SQLException, ClassNotFoundException {

        AcessoDAO.initBD();

        new ManagerWindowView();
    }
}
