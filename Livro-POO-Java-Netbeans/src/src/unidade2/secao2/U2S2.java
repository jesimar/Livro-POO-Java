package src.unidade2.secao2;

/**
 *
 * @author Jesimar S. Arantes
 */
public class U2S2 {
    public static void main(String[] args) {
        U2S2 u2s2 = new U2S2();
        u2s2.min(5, 3);
        u2s2.max(13, 8);
        u2s2.abs(3);
        u2s2.abs(-3);
        u2s2.sinal(5);
        u2s2.sinal(-5);
        u2s2.passou(55);
        u2s2.passou(65);
        u2s2.compXY(5, 3);
        u2s2.compXY(5, 5);
        u2s2.compXY(3, 5);
        u2s2.diaDaSemana(0);
        u2s2.diaDaSemana(3);
        u2s2.diaDaSemana(6);
        u2s2.tiposDerivados();
        for (int i = 0; i < 30; i++){
            long fatIte = U2S2.fatorialIterativo(i);
            long fatRec = U2S2.fatorialRecursivo(i);
            if (i > 20){
                System.out.println("ocorreu overflow: valor incorreto para fatorial");
            }
            System.out.println("fatorialIterativo(" + i + ") = " + fatIte);
            System.out.println("fatorialRecursivo(" + i + ") = " + fatRec);
        }
        u2s2.passouDeAno(65, 82);
        u2s2.passouDeAno(90, 74);
        u2s2.passouDeAno(55, 76);
        u2s2.avaliaExpressao(5, 3);
        u2s2.avaliaExpressao(3, 5);
        u2s2.avaliaExpressao(5, 5);
        u2s2.testeSwitch();
        int s = 100;
        System.out.println("Somatorio: " + u2s2.somatorioFor(s));
        System.out.println("Somatorio: " + u2s2.somatorioWhile(s));
        System.out.println("Somatorio: " + u2s2.somatorioDoWhile(s));
    }
    
    public void min(double x, double y){
        double min = x < y ? x : y;
        System.out.println("min: " + min);
    }
    
    public void max(double x, double y){
        double max = x > y ? x : y;
        System.out.println("max: " + max);
    }
    
    public void abs(double valor){
        double abs = valor >= 0 ? valor : -valor;
        System.out.println("abs: " + abs);
    }
    
    public void sinal(float number){
        String sinal = number > 0.0 ? "positivo" : "não-positivo";
        System.out.println("resultado sinal: " + sinal);
    }
    
    public void passou(int nota){
        String resultado = nota >= 60 ? "passou de ano" : "reprovou de ano";
        System.out.println("resultado final: " + resultado);
    }
    
    public void compXY(int x, int y){
        String compXY = x > y ? "maior" : x < y ? "menor" : "igual";
        System.out.println("comparaçãoXY: " + compXY);
    }
    
    public void diaDaSemana(int dia){
        String diaSem = dia == 0 ? "dom" : dia == 1 ? "seg" : 
                        dia == 2 ? "ter" : dia == 3 ? "qua" : 
                        dia == 4 ? "qui" : dia == 5 ? "sex" : "sab";
        System.out.println("dia-da-semana: " + diaSem);
    }
    
    public void tiposDerivados(){
        byte x = 5;
        Byte vbyte = x;
        System.out.println("Byte : " + vbyte);
        System.out.println("Byte MIN : " + Byte.MIN_VALUE);
        System.out.println("Byte MAX : " + Byte.MAX_VALUE);
        
        short sh = 3; 
        Short vshort = sh;
        System.out.println("Short: " + vshort);
        System.out.println("Short MIN : " + Short.MIN_VALUE);
        System.out.println("Short MAX : " + Short.MAX_VALUE);
        
        Boolean vbool = true;
        System.out.println("Boolean: " + vbool);
        System.out.println("Boolean FALSE: " + Boolean.FALSE);
        System.out.println("Boolean TRUE: " + Boolean.TRUE);
        
        Character vcharacter = 'a';
        System.out.println("Character: " + vcharacter);
        System.out.println("Character MIN: " + Character.MIN_VALUE);
        System.out.println("Character MAX: " + Character.MAX_VALUE);
        
        Integer integer = 10;
        System.out.println("Integer: " + integer);
        System.out.println("Integer MIN: " + Integer.MIN_VALUE);
        System.out.println("Integer MAX: " + Integer.MAX_VALUE);
        
        Long vlong = 5L;
        System.out.println("Long: " + vlong);
        System.out.println("Long MIN: " + Long.MIN_VALUE);
        System.out.println("Long MAX: " + Long.MAX_VALUE);
        
        Float vfloat = 5.3f;
        System.out.println("Float: " + vfloat);
        System.out.println("Float MIN: " + Float.MIN_VALUE);
        System.out.println("Float MAX: " + Float.MAX_VALUE);
        
        Double vdouble = 10.6;
        System.out.println("Double: " + vdouble);
        System.out.println("Double MIN: " + Double.MIN_VALUE);
        System.out.println("Double MAX: " + Double.MAX_VALUE);
    }
        
    public static long fatorialIterativo(int n){
        long fat = 1;
        for (int i = 1; i <= n; i++){
            fat *= i;
        }
        return fat;
    }
    
    public static long fatorialRecursivo(int n){
        if (n == 1 || n == 0 ) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }
    
    public void passouDeAno(int nota, int presenca){
        String result = (nota >= 60 && presenca >= 75) ? "aprovado" : 
                (nota >= 50 && presenca >= 75) ? "recuperação" : "reprovado"; 
        System.out.println("resultado final ano letivo: " + result);
    }
    
    public void testeSwitch(){
        System.out.println("Inicio-Switch");
        int opcao = 'a';
        switch(opcao){
            case 'a':
                System.out.println("A opção (a) foi escolhida");
                break;
            case 'b':
                System.out.println("A opção (b) foi escolhida");
                break;
            case 'c':
                System.out.println("A opção (c) foi escolhida");
                break;
            default:
                System.out.println("A opção default foi escolhida");
        }
        System.out.println("Fim-Switch");
    }
    
    public void avaliaExpressao(int x, int y){
        boolean expressao = (x > y) && (y+2 == x) || (y*2 < x) && !(x - y >= 0);
        System.out.println("AvaliaExpressao: " + expressao);
    }
    
    public long somatorioFor(int n){
        long soma = 0;
        for (int i = 0; i <= n; i++){
            soma += i;
        }
        return soma;
    }
    
    public long somatorioWhile(int n){
        long soma = 0;
        int i = 0;
        while (i <= n){
            soma += i;
            i++;
        }
        return soma;
    }
    
    public long somatorioDoWhile(int n){
        long soma = 0;
        int i = 0;
        do {
            soma += i;
            i++;
        } while (i <= n);
        return soma;
    }
}