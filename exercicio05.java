import java.util.Scanner;

public class exercicio05 {
    
    public static void main(String[] args) {
        String mes[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
           "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        
        int diaAniversario, mesAniversario;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o dia do seu aniversário:");
        diaAniversario = ler.nextInt();

        System.out.println("Digite o mês do seu aniversário:");
        mesAniversario = ler.nextInt();

        ler.close();
        
        if(mesAniversario == 3 || mesAniversario == 6 || mesAniversario == 9 || mesAniversario == 11){
            if(diaAniversario > 30 || diaAniversario < 1){
                System.out.println("Dia inválido para o mês");
                System.exit(0);
            }
        }
        else if(mesAniversario == 2){
            if(diaAniversario > 28 || diaAniversario < 1){
                System.out.println("Dia inválido para o mês");
                System.exit(0);
            }
        }else{
            if(diaAniversario > 31 || diaAniversario < 1){
                System.out.println("Dia inválido para o mês");
                System.exit(0);
            }
        }
        
        for(int i=0;i<12;i++){
            if((mesAniversario-1) == i){
                System.out.printf("Sua data de aniversário eh: %d de %s\n", diaAniversario, mes[i]);
                System.exit(0);
            }
        }
        System.out.println("Número do mês inválido!!!");
    }
}
