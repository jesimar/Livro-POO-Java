package br.com.catalogofilmes.dao;

import br.com.catalogofilmes.handler.Filme;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe acesso
 * @author Antonio, Jesimar e Talles
 */
public class AcessoDAO {

    private static Connection connection;

    //===========================INICIALIZA BANCO===============================

    /**
     * Inicializa o banco de dados. 
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static void initBD() throws ClassNotFoundException, SQLException{
        String driverName = "org.gjt.mm.mysql.Driver";
        Class.forName(driverName);
        String serverName = "localhost";
        String mydatabase = "bd_filmes";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
        String username = "root";
        String password = "";
        connection = DriverManager.getConnection(url, username, password);
    }

    //================================SELECT====================================

    /**
     * Seleciona do banco de dados, na tabela TABELA com as restrições passadas 
     * as linhas onde o tipo é do tipo passado como argumento.     
     * @return Lista de todas as linhas selecionadas.
     * @throws SQLException Excessão de erro no banco.
     */

    public static ResultSet selectBanco(String tabela) throws SQLException{
        String sql = "SELECT * FROM " + tabela;
        PreparedStatement pStatement = connection.prepareStatement(sql);
        ResultSet resultSet = pStatement.executeQuery();
        return resultSet;
    }
    
    public static ResultSet selectBanco(String tabela, String restricao,
            String tipoRestString) throws SQLException{
        String sql = "SELECT * FROM "+ tabela + " WHERE " + restricao + " = '"
                + tipoRestString + "'";
        PreparedStatement pStatement = connection.prepareStatement(sql);
        ResultSet resultSet = pStatement.executeQuery();
        return resultSet;
    }

    public static ResultSet selectBanco(String tabela, String restricao,
            int tipoRestInt) throws SQLException{
        String sql = "SELECT * FROM "+ tabela + " WHERE " + restricao + " = "
                + tipoRestInt;
        PreparedStatement pStatement = connection.prepareStatement(sql);
        ResultSet resultSet = pStatement.executeQuery();
        return resultSet;
    }

    public static ResultSet selectBanco(String tabela, String rest1,
            String tipoRest1, String rest2, String tipoRest2) throws SQLException{
        String sql = "SELECT * FROM " + tabela + " WHERE " + rest1 + " = '" +
                tipoRest1 + "' and " + rest2 + " = '" + tipoRest2 + "'";
        PreparedStatement pStatement = connection.prepareStatement(sql);
        ResultSet resultSet = pStatement.executeQuery();
        return resultSet;
    }

    public static ResultSet selectBanco(String tabela, String rest1,
            String tipoRest1, String rest2, int tipoRest2) throws SQLException{
        String sql = "SELECT * FROM " + tabela + " WHERE " + rest1 + " = '" +
                tipoRest1 + "' and " + rest2 + " = " + tipoRest2;
        PreparedStatement pStatement = connection.prepareStatement(sql);
        ResultSet resultSet = pStatement.executeQuery();
        return resultSet;
    }

    //================================DELETAR===================================

    /**
     * Deleta do banco de dados, na tabela correspondente com as restrições
     * passadas as linhas onde o tipo é do tipo passado como argumento.
     * @throws SQLException Excessão de erro no banco.
     */

    public static void deletarBancoProduto(int codigo)
            throws SQLException{
        String sql = "SELECT * FROM Produto WHERE codigo="+codigo;
        PreparedStatement pStatement = connection.prepareStatement(sql);
        sql = "DELETE FROM Produto WHERE codigo=" + codigo;
        pStatement = connection.prepareStatement(sql);
        pStatement.executeUpdate(sql);
    }

    //================================INSERT====================================

    /**
     * Insere no banco de dados, na tabela correspondente com as restrições passadas
     * as linhas onde o tipo é do tipo passado como argumento.
     * @throws SQLException Excessão de erro no banco.
     */

    public static void insertBancoProduto(Filme prod) throws SQLException{
        Statement st = connection.createStatement();
        String sql = "INSERT INTO Produto (ano, titulo, genero, " +
                "diretor) VALUES ('" +
                prod.getAno() + ", '" +
                prod.getTitulo() + "', '" +
                prod.getGenero() + "', " + 
                prod.getDiretor() + "')";
        st.executeUpdate(sql);
        st.close();
    }

    //================================EDITAR====================================

    /**
     * Edita no banco de dados, na tabela correspondente com as restrições passadas
     * as linhas onde o tipo é do tipo passado como argumento.
     * @throws SQLException Excessão de erro no banco.
     */

    public static void editarBancoProduto(Filme prod) throws SQLException {
        Statement st = connection.createStatement();
        String sql = " UPDATE Produto set titulo='" + prod.getTitulo() +
                "', genero='" + prod.getGenero() +
                "', ano=" + prod.getAno() +
                ", diretor='" + prod.getDiretor() + 
                "' where codigo=" + prod.getCodigo();
        System.out.println("sql " + sql);
        st.executeUpdate(sql);
        st.close();
    }

    /**
     * Fecha a conecção com o banco de dados.
     * @throws SQLException Excessão de erro no banco.
     */
    public static void fecharConexao() throws SQLException{
        connection.close();
    }
}
