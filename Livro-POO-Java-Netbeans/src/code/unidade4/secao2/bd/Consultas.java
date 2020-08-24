package code.unidade4.secao2.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jesimar
 */
public class Consultas {
    
    public void listarClientes(Connection connection){
        try {
            String sql = "SELECT * FROM `clientes`";
            PreparedStatement pStatement = connection.prepareStatement(sql);
            ResultSet resultSet = pStatement.executeQuery();
            System.out.println("Resultados da Consulta: ");
            System.out.printf("| %8s | %16s | %16s | %16s | %16s | %18s |%n",
                    "codigo", "nome", "idade", "profissao", "cidade", "estado");
            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String idade = resultSet.getString("idade");
                String profissao = resultSet.getString("profissao");
                String cidade = resultSet.getString("cidade");
                String estado = resultSet.getString("estado");
                String codigo = resultSet.getString("codigo");
                System.out.printf("| %8s | %16s | %16s | %16s | %16s | %18s |%n", 
                        codigo, nome, idade, profissao, cidade, estado);
            }
        } catch (SQLException ex) {
            System.out.println("Problema de acesso ao banco de dados");
            System.out.println(ex);
        }
    }
    
    public void inserirCliente(Connection connection, Cliente cliente){
        try {
            Statement st = connection.createStatement();
            String sql = "INSERT INTO `clientes` (" +
                    "nome, idade, profissao, cidade, estado) " + 
                    "VALUES ('" + 
                    cliente.getNome() + "', " + 
                    cliente.getIdade() + ", '" + 
                    cliente.getProfissao()+ "', '" + 
                    cliente.getCidade()+ "', '" + 
                    cliente.getEstado()+ "')";
            st.executeUpdate(sql);
            st.close();
        } catch (SQLException ex) {
            System.out.println("Problema de acesso ao banco de dados");
            System.out.println(ex);
        }
    }
}
