import java.util.Scanner;

public class exercicio04 {
    
    public static void main(String[] args) {
        String mes[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
           "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        
        int mesEscolhido;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número do mês:");
        mesEscolhido = ler.nextInt();

        ler.close();
        for(int i=0;i<12;i++){
            if((mesEscolhido-1) == i){
                System.out.printf("O mês escolhido eh: %s\n", mes[i]);
                System.exit(0);
            }
        }
        System.out.println("Número do mês inválido!!!");
    }
}
