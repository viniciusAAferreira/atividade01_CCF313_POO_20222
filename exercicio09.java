import java.util.Scanner;

public class exercicio09 {
    
    public static void main(String[] args) {
        String entrada;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a operação desejada:");
        entrada = ler.next();
        
        String primeira = entrada.substring(0, (entrada + " ").indexOf(" "));
        int numeroA = Integer.parseInt(entrada.substring(1, (entrada + " ").indexOf(" ")));
        //if(entrada[0] == "soma"){

        //}
        System.out.printf("%d", numeroA);


        ler.close();
    }

    
}
