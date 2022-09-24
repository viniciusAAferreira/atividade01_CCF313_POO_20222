import java.util.Scanner;
import java.util.Arrays;

public class exercicio08 {
    
    public static void main(String[] args){

        int[] numeros = new int[100];
        String entrada = "Valor";
        int i=0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os números desejados e logo depois digite fim");
        entrada = ler.next();

        while(!entrada.equals("fim")){
            numeros[i] = Integer.parseInt(entrada);
            entrada = ler.next();
            i++;
        }
        int[] novoNumeros = new int[i];
        for(int j=0;j<i;j++){
            novoNumeros[j] = numeros[j];
        }
        Arrays.sort(novoNumeros);

        System.out.println("A ordem dos números eh:");
        for(int j=0;j<i;j++){
            System.out.printf("%d ", novoNumeros[j]);
        }

        ler.close();
    }
}
