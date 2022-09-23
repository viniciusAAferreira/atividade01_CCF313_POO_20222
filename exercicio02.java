import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        int numerador;
        int denominador;

        System.out.println("Digite o seu numerador:");
        numerador = ler.nextInt();
        
        System.out.println("Digite o seu denominador:");
        denominador = ler.nextInt();

        ler.close();
        if(denominador == 0){
            System.out.println("Impossível resolver! Denominador eh 0!!!");
            System.exit(0);
        }
        System.out.printf("O numero real eh: %.2f\n", (float)numerador/(float)denominador);
    

    }
    
}
