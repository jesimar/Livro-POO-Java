package code.unidade4.secao3.sp.simulator.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jesimar S. Arantes
 * Código 4.20
 */
public class ConexaoBD {

    private Connection con = null;
    
    private final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private final String prefixoBD = "jdbc:mysql://";
    private final String nomeHost = "localhost";
    private final String portaBD = "3306";
    private final String nomeBD = "bd_simulador_robo"; //colocar o nome do seu banco de dados
    private final String nomeUsuario = "root";  //colocar o nome de seu usuario
    private final String senha = "";            //colocar a sua senha
    private String url = null;

    public ConexaoBD() {
        //"jdbc:mysql://localhost:3306/bd_simulador_robo";
        url = prefixoBD + nomeHost + ":" + portaBD + "/" + nomeBD;
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
