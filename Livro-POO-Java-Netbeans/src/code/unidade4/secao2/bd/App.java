package code.unidade4.secao2.bd;

import java.sql.Connection;

/**
 *
 * @author jesimar
 */
public class App {
    public static void main(String[] args) {
        ConexaoBD conBD = new ConexaoBD();
        Connection connection = conBD.getConexao();        
        Consultas consultas = new Consultas();
        consultas.listarClientes(connection);
        Cliente clienteRita = new Cliente(100, "Rita", 27, "Dona de casa", 
                "Pelotas", "Rio Grande do Sul");
        consultas.inserirCliente(connection, clienteRita);
        Cliente clientePedro = new Cliente(101, "Pedro", 53, "Pedreiro", 
                "Salvador", "Bahia");
        consultas.inserirCliente(connection, clientePedro);
        consultas.listarClientes(connection);
        conBD.fecharConexao();
    }
}
