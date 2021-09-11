package aula08exvetor03;


public class Aula08ExVetor03 {

    public static void main(String[] args) {
        //Crie dois vetores A e B com 5 elementos inteiros. 
        //Crie também um vetor C com 5 elementos inteiros que seja 
        //a soma dos elementos em cada posição dos vetores A e B. 
        //Ou seja C[i] = A[i]+B[i].
        
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {3, 5, 8, 3, 1};
        int[] vetorC = new int[vetorA.length];
        
        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i]+vetorB[i];
            System.out.println("O elemento da posição " + i + " do Vetor C é = " + vetorC[i]); 
        }
    }
    
}
