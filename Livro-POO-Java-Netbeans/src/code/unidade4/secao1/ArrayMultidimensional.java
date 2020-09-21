package code.unidade4.secao1;

/**
 * @author Jesimar da Silva Arantes
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        ArrayMultidimensional array = new ArrayMultidimensional();
        array.matriz1();
        array.matriz2();
        array.matriz3();
        array.matriz4();
        array.matriz5();
        array.matriz6();
    }
    
    //Código 4.2
    private void matriz1(){
        System.out.println("Exemplo1");
        double matriz[][] = {{1.5, 5.2}, {3.6, 4.9}, {2.4, 8.1}}; 
        for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("M[" + i + "][" + j + "]: " + matriz[i][j]); 
            }
        }
    }
    
    private void matriz2(){
        System.out.println("Exemplo2");
        int matrizInteiros[][] = {{1, 5}, {3, 4}, {2, 8}};
        System.out.println("Array[0][0]: " + matrizInteiros[0][0]);
        System.out.println("Array[0][1]: " + matrizInteiros[0][1]);
        System.out.println("Array[1][0]: " + matrizInteiros[1][1]);
        System.out.println("Array[1][1]: " + matrizInteiros[1][1]);
        System.out.println("Array[2][0]: " + matrizInteiros[2][0]);
        System.out.println("Array[2][1]: " + matrizInteiros[2][1]);
//        System.out.println("Array0: " + vetorInteiros[5]); //gera uma exceçao
//        System.out.println("Array0: " + vetorInteiros[-1]);//gera uma exceçao
    }
    
    private void matriz3(){
        System.out.println("Exemplo3");
        float matrizFloat[][] = new float [3][2];
        matrizFloat[0][0] = 1.0f;
        matrizFloat[0][1] = 5.0f;
        matrizFloat[1][0] = 3.0f;
        matrizFloat[1][1] = 4.0f;
        matrizFloat[2][0] = 2.0f;
        matrizFloat[2][1] = 8.0f;
        for (int i = 0; i < matrizFloat.length; i++){
            for (int j = 0; j < matrizFloat[i].length; j++){
                System.out.println("Array[" + i + "][" + j + "] " + matrizFloat[i][j]);
            }
        }
    }
        
    private void matriz4(){
        System.out.println("Exemplo4");
        int matriz[][][] = new int [4][3][2];
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    matriz[i][j][k] = soma;
                    soma++;
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                for (int k = 0; k < matriz[0][0].length; k++) {
                    System.out.println("mat[" + i + "][" + j + "][" + k + "] = " 
                            + matriz[i][j][k]);
                }
            }
        }
    }
    
    //Código 4.3
    private void matriz5(){
        System.out.println("Exemplo5");
        int mat[][] = {{2, 4, 7}, {6, 3}, {5, 1, 9, 0}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("M[" + i + "][" + j + "] = " + mat[i][j]);
            }
        }
    }
    
    private void matriz6(){
        System.out.println("Exemplo6");
        boolean mat[][] = new boolean[12][];
        for (int i = 0; i < mat.length; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 6 || 
                    i == 7 || i == 9 || i == 11) {
                mat[i] = new boolean[31];
            }else if (i == 3 || i == 5 || i == 8 || i == 10) {
                mat[i] = new boolean[30];
            }if (i == 1) {
                mat[i] = new boolean[28];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.print("mês[" + (i+1) + "] -> ");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("  " + mat[i][j]);
            }
            System.out.println();
        }
    }
}
