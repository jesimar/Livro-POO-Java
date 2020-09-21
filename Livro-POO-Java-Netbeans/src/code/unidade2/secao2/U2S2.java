package code.unidade2.secao2;

/**
 * @author Jesimar S. Arantes
 * Códigos: diversos da seção
 */
public class U2S2 {
    public static void main(String[] args) {
        max(13, 8);
        min(5, 3);
        compXY(5, 3);
        compXY(5, 5);
        compXY(3, 5);
        diaDaSemana(0);
        diaDaSemana(3);
        diaDaSemana(6);
        for (int i = 0; i < 30; i++){
            long fatIte = fatorialIterativo(i);
            long fatRec = fatorialRecursivo(i);
            if (i > 20){
                System.out.println("ocorreu overflow: valor incorreto para fatorial");
            }
            System.out.println("fatorialIterativo(" + i + ") = " + fatIte);
            System.out.println("fatorialRecursivo(" + i + ") = " + fatRec);
        }
        tiposDerivados();
    }
    
    public static void max(double x, double y){
        double max = x > y ? x : y;
        System.out.println("max: " + max);
    }
    
    public static void min(double x, double y){
        double min = x < y ? x : y;
        System.out.println("min: " + min);
    }
    
    public static void compXY(int x, int y){
        String compXY = x > y ? "maior" : x < y ? "menor" : "igual";
        System.out.println("comparaçãoXY: " + compXY);
    }
    
    public static void diaDaSemana(int dia){
        String diaSem = dia == 0 ? "dom" : dia == 1 ? "seg" : 
                        dia == 2 ? "ter" : dia == 3 ? "qua" : 
                        dia == 4 ? "qui" : dia == 5 ? "sex" : "sab";
        System.out.println("dia-da-semana: " + diaSem);
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
    
    public static void tiposDerivados(){
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
    
}