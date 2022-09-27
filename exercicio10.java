import java.util.Scanner;
import java.util.Random;

public class exercicio10 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Random numAleatorio = new Random();
        int numSorteado = numAleatorio.nextInt(100)+1;
        int resposta = 0, i=0;
        //System.out.printf("O número sorteado eh: %d\n", numSorteado);
        
        do{
            System.out.println("Digite o valor sorteado:");
            resposta = ler.nextInt();
            if(resposta > numSorteado){
                System.out.printf("O valor sorteado eh menor que %d.\n", resposta);
            }else if(resposta < numSorteado){
                System.out.printf("O valor sorteado eh maior que %d.\n", resposta);
            }
            i++;

        }while(resposta != numSorteado);
        System.out.printf("PARABÉNS!!! O número sorteado eh: %d e você conseguiu em %d tentativas\n", resposta, i);

        ler.close();
    }
}
