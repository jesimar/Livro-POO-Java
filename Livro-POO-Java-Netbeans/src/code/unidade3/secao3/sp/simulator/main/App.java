package code.unidade3.secao3.sp.simulator.main;

import code.unidade3.secao3.sp.simulator.core.Robo;
import java.util.Scanner;

/**
 * Classe principal que inicia o simulador do robô.
 * @author Jesimar S. Arantes
 */
public class App {
    
    /**
     * Ponto de entrada da aplicação.
     * @param args lista de argumentos recebido via linha de comando.
     */
    public static void main(String[] args) {
        if (args.length != 0){
            args[0] = args[0].toLowerCase();
            if (args[0].equals("--author") || 
                      args[0].equals("-a")){
                System.out.println("Autor: Jesimar da Silva Arantes");
            } else if (args[0].equals("--version") ||
                      args[0].equals("-v")){
                System.out.println("Versão: 1.0.0");
            } else if (args[0].equals("--help") ||
                      args[0].equals("-h")){
                System.out.println("Comando com Movimentos Agendados:");
                System.out.println("\t--move w a w w s d d a");
            } else if (args[0].equals("--commands") ||
                      args[0].equals("-c")){
                System.out.println("Comandos suportados:");
                System.out.println("\tw: move para cima");
                System.out.println("\ta: move para esquerda");
                System.out.println("\ts: move para baixo");
                System.out.println("\td: move para direita");
                System.out.println("\t0: sair da aplicação");
            } else if (args[0].equals("--move") ||
                      args[0].equals("-m")){
                Robo robo = new Robo();
                System.out.println("Execução com movimentos agendados: ");
                robo.movimentosAgendados(args);
            } else {
                System.out.println("Argumento não válido");
            }
            System.exit(0);
        }
        Robo robo = new Robo();
        String tecla = "";
        Scanner scan = new Scanner(System.in);
        boolean ok = false;
        do{
            try{
                tecla = scan.next();
                robo.setOrientacao(tecla.charAt(0));
                robo.printPos();
            }catch (IllegalArgumentException ex){
                if (tecla.charAt(0) == '0'){
                    ok = true;
                }else{
                    System.out.println("Valor errado");
                    scan.nextLine();
                    ok = false;
                }
            }
        }while(!ok);
        robo.printPos();
    }
}
