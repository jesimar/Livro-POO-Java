package code.unidade4.secao1;

import java.util.Arrays;

/**
 * @author Jesimar da Silva Arantes
 */
public class ArrayUnidimensional {
    public static void main(String[] args) {
        ArrayUnidimensional array = new ArrayUnidimensional();
        array.vetor1();
        array.vetor2();
        array.vetor3();
        array.vetor4();
        array.vetor5();
        array.vetor6();
        array.vetor7();
        array.vetor8();
    }
    
    //Código 4.1
    private void vetor1(){
        System.out.println("Exemplo1");
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
    
    private void vetor2(){
        System.out.println("Exemplo2");
        int vetorInteiros[] = {1, 5, 3, 4};
        System.out.println("Array[0]: " + vetorInteiros[0]);
        System.out.println("Array[1]: " + vetorInteiros[1]);
        System.out.println("Array[2]: " + vetorInteiros[2]);
        System.out.println("Array[3]: " + vetorInteiros[3]);
//        System.out.println("Array[4]: " + vetorInteiros[4]);   //gera uma exceção
//        System.out.println("Array[-1]: " + vetorInteiros[-1]); //gera uma exceção
    }
    
    private void vetor3(){
        System.out.println("Exemplo3");
        int vetorInteiros[] = {1, 5, 3, 4};
        for (int valor : vetorInteiros){
            System.out.println("Array: " + valor);
        }
    }
    
    private void vetor4(){
        System.out.println("Exemplo4");
        int vetorInteiros[] = {1, 5, 3, 4};
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println("Array[" + i + "]: " + vetorInteiros[i]);
        }
    }
    
    private void vetor5(){
        System.out.println("Exemplo5");
        float vetorFloat[] = {2.0f, 5.3f, 3.8f};
        for (int i = 0; i < vetorFloat.length; i++) {
            System.out.println("Array[" + i + "]: " + vetorFloat[i]);
        }
    }
    
    private void vetor6(){
        System.out.println("Exemplo6");
        double vetorDouble[] = {2.0, 5.3, 3.8};
        for (int i = 0; i < vetorDouble.length; i++) {
            System.out.println("Array[" + i + "]: " + vetorDouble[i]);
        }
    }
    
    private void vetor7(){
        System.out.println("Exemplo7");
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
    
    //Código 4.4
    private void vetor8(){
        System.out.println("Exemplo8");
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
