package code.unidade4.secao1;

import java.util.Arrays;

/**
 *
 * @author jesimar
 */
public class ArrayUnidimensional {
    public static void main(String[] args) {
        ArrayUnidimensional array = new ArrayUnidimensional();
        array.array();
        array.array0();
        array.array1();
        array.array2();
        array.array3();
        array.array4();
        array.array5();
        array.array6();
        array.array7();
        array.array8();
    }
    
    private void array(){
        int vetor[] = new int[5]; 
        vetor[0] = 1; 
        vetor[1] = 5; 
        vetor[2] = 3; 
        vetor[3] = 4; 
        vetor[4] = 2; 
        for (int i = 0; i < vetor.length; i++) { 
            System.out.println("Array[" + i + "]: " + vetor[i]); 
        } 
    }
    
    private void array0(){
        int vetorInteiros[] = {1, 5, 3, 4, 2};
        System.out.println("Array[0]: " + vetorInteiros[0]);
        System.out.println("Array[1]: " + vetorInteiros[1]);
        System.out.println("Array[2]: " + vetorInteiros[2]);
        System.out.println("Array[3]: " + vetorInteiros[3]);
        System.out.println("Array[4]: " + vetorInteiros[4]);
        System.out.println("Array[5]: " + vetorInteiros[5]); //gera uma exceçao
//        System.out.println("Array[-1]: " + vetorInteiros[-1]);//gera uma exceçao
        
        int[] a = {1};
    }
    
    private void array1(){
        int vetorInteiros[] = {1, 5, 3, 4, 2};
        for (int valor : vetorInteiros){
            System.out.println("Array: " + valor);
        }
    }
    
    private void array2(){
        int vetorInteiros[] = {1, 5, 3, 4, 2};
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println("Array[" + i + "]: " + vetorInteiros[i]);
        }
    }
    
    private void array3(){
        float vetorFloat[] = {1.0f, 5.3f, 3.2f, 4.2f, 2.7f};
        for (int i = 0; i < vetorFloat.length; i++) {
            System.out.println("Array[" + i + "]: " + vetorFloat[i]);
        }
    }
    
    private void array4(){
        double vetorDouble[] = {1.0, 5.3, 3.2, 4.2, 2.7};
        for (int i = 0; i < vetorDouble.length; i++) {
            System.out.println("Array[" + i + "]: " + vetorDouble[i]);
        }
    }
    
    private void array5(){
        double vetorDouble[] = new double[5];
        vetorDouble[0] = 1;
        vetorDouble[1] = 5.2;
        vetorDouble[2] = 3.8;
        vetorDouble[3] = 9.1;
        vetorDouble[4] = 4.7;
        for (int i = 0; i < vetorDouble.length; i++) {
            System.out.println("Array[" + i + "]: " + vetorDouble[i]);
        }
    }
    
    private void array6(){
        Double vetorDouble[] = new Double[5];
        vetorDouble[0] = 1.0;
        vetorDouble[1] = 5.2;
        vetorDouble[2] = 3.8;
        vetorDouble[3] = 9.1;
        vetorDouble[4] = 4.7;
        for (int i = 0; i < vetorDouble.length; i++) {
            System.out.println("Array[" + i + "]: " + vetorDouble[i]);
        }
    }
    
    private void array7(){
        float vetorFloat[] = {6.0f, 5.3f, 7.2f, 4.2f, 2.7f};
        System.out.println("Antes de Ordenar");
        for (int i = 0; i < vetorFloat.length; i++) {
            System.out.println("Array[" + i + "]: " + vetorFloat[i]);
        }
        Arrays.sort(vetorFloat);//Algoritmo Dual Pivo Quicksort
        
        System.out.println("Depois de Ordenar");
        for (int i = 0; i < vetorFloat.length; i++) {
            System.out.println("Array[" + i + "]: " + vetorFloat[i]);
        }
    }
    
    private void array8(){
        int vetor[] = {6, 3, 7, 4, 2, 5, 1, 9, 8};
        System.out.println("Antes de Ordenar");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        Arrays.sort(vetor);//Algoritmo Dual Pivo Quicksort
        System.out.println("Depois de Ordenar");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
