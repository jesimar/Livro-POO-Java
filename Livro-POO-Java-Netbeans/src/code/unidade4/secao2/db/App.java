package code.unidade4.secao2.db;

/**
 *
 * @author jesimar
 */
public class App {
    public static void main(String[] args) {
        ConexaoBDMySQL con = new ConexaoBDMySQL();
        con.getConnection();
    }
}
