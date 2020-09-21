package code.unidade3.secao1.ex1;

import java.util.Locale;

/**
 * @author Jesimar da Silva Arantes
 * Código 3.3
 */
public class ArgsLinhaDeComandoMath {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        if (args.length == 0){
            System.err.println("Precisa de Argumentos");
            System.exit(0);
        }
        String resp = "ERROR";
        args[0] = args[0].toLowerCase();
        if (args[0].equals("--help") || 
                args[0].equals("-h")){
            resp = "Programa: Cmd Math via args\n" + 
                   "Funções:\n\tsqrt x\n\tpow x y\n\tlog10 x\n" +
                   "Constantes:\n\tPI\n\tE\n\tPHI\n";
        }else if (args[0].equals("--author") || 
                args[0].equals("-a")){
            resp = "Autor: Jesimar da Silva Arantes";
        }else if (args[0].equals("--version") ||
                args[0].equals("-v")){
            resp = "Versão: 1.0";
        }else if (args[0].equals("sqrt")){
            resp = Math.sqrt(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("pow")){
            resp = Math.pow(Double.parseDouble(args[1]), Double.parseDouble(args[2])) + "";
        }else if (args[0].equals("log10")){
            resp = Math.log10(Double.parseDouble(args[1])) + "";
        }else if (args[0].equals("pi")){
            resp = Math.PI + "";
        }else if (args[0].equals("e")){
            resp = Math.E + "";
        }else if (args[0].equals("phi")){
            resp = 1.618033988749895 + "";
        }
        System.out.println(resp);
    }
}
