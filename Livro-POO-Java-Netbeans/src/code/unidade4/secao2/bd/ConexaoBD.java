package code.unidade4.secao2.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jesimar da Silva Arantes
 * Código 4.12
 */
public class ConexaoBD {

    private Connection con = null;
    
    private final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private final String prefixoBD = "jdbc:mysql://";
    private final String nomeHost = "localhost";
    private final String portaBD = "3306";
    private final String nomeBD = "bd_empresa"; //colocar o nome do seu banco de dados
    private final String tempo = "?useTimezone=true&serverTimezone=UTC";
    private final String nomeUsuario = "root";  //colocar o nome de seu usuario
    private final String senha = "";            //colocar a sua senha
    private String url = null;

    public ConexaoBD() {
        //"jdbc:mysql://localhost:3306/bd_empresa";
        url = prefixoBD + nomeHost + ":" + portaBD + "/" + nomeBD + tempo;
    }

    public Connection getConexao() {
        try {
            if (con == null) {
                Class.forName(jdbcDriver);
                con = DriverManager.getConnection(url, nomeUsuario, senha);
            } else if (con.isClosed()) {
                con = null;
                return getConexao();
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return con;
    }

    public void fecharConexao() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
}
