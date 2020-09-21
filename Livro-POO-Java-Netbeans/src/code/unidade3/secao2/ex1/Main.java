package code.unidade3.secao2.ex1;

/**
 * @author Jesimar da Silva Arantes
 * Código 3.17
 */
public class Main {
    public static void main(String[] args) {
        DiaDaSemana dia = DiaDaSemana.TER;
        switch (dia){
            case DOM:
                System.out.println("Domingo");
                break;
            case SEG:
                System.out.println("Segunda-Feira");
                break;
            case TER:
                System.out.println("Terça-Feira");
                break;
            case QUA:
                System.out.println("Quarta-Feira");
                break;
            case QUI:
                System.out.println("Quinta-Feira");
                break;
            case SEX:
                System.out.println("Sexta-Feira");
                break;
            case SAB:
                System.out.println("Sábado");
                break;
        }
    }
}
