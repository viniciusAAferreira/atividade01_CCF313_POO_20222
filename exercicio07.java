import java.util.Scanner;


public class exercicio07 {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        int N, menorValor=1000, maiorValor=0, soma=0, par=0;

        System.out.println("Digite a quantidade de números:");
        N = ler.nextInt();

        int[] numerosInt = new int[N];

        System.out.println("Digite os números inteiros");
        for(int i=0; i<N; i++){
            numerosInt[i]= ler.nextInt();
            soma += numerosInt[i];
            if(numerosInt[i] > maiorValor){
                maiorValor = numerosInt[i];
            }
            if(numerosInt[i] < menorValor){
                menorValor = numerosInt[i];
            }
            if(numerosInt[i]%2 == 0){
                par++;
            }

        }
        ler.close();
        System.out.printf("Maior valor: %d\nMenor valor: %d\nMédia aritmética: %.2f\nValores pares: %d\n" +
            "Valores ímpares: %d\n", maiorValor, menorValor, (float)soma/(float)N, par, N-par);

    }  
}
