import java.util.Scanner;

public class exercicio06 {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        int horas, minutos, segundos;
        int[] horarios = new int[]{1, 2, 3};

        for(int i=0; i<2; i++){
            System.out.printf("Digite as horas do %d horário:\n", i+1);
            horas = ler.nextInt();

            System.out.printf("Digite as minutos do %d horário:\n", i+1);
            minutos = ler.nextInt();

            System.out.printf("Digite as segundos do %d horário:\n", i+1);
            segundos = ler.nextInt();
            
            horarios[i]= 60*60*horas +  60*minutos + segundos;
        }
        ler.close();
        
        horarios[2] = Math.abs(horarios[1] - horarios[0]);
        System.out.printf("A diferença de horários eh de: %d segundos\n", horarios[2]);
    }
}
