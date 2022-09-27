import java.util.Scanner;

public class exercicio09 {
    
    public static void main(String[] args) {
        String entrada;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a operação desejada no seguinte formato:\nMULTIPLICA A POR B;\nDIVIDE A POR B;\nSOMA A POR B;\nSUBTRAI A POR B.");
        entrada = ler.nextLine();

        String[] subEntrada = entrada.split(" ");
        
        float numeroA = Float.parseFloat(subEntrada[1]);
        float numeroB = Float.parseFloat (subEntrada[3]);

        if (subEntrada[0].equals("SOMA")){
            System.out.printf("A soma de %.2f por %.2f eh: %.2f\n", numeroA, numeroB, numeroA+numeroB);
        }else if (subEntrada[0].equals("SUBTRAI")){
            System.out.printf("A subtração de %.2f por %.2f eh: %.2f\n", numeroA, numeroB, numeroA-numeroB);
        }else if (subEntrada[0].equals("MULTIPLICA")){
            System.out.printf("A multiplicação de %.2f por %.2f eh: %.2f\n", numeroA, numeroB, numeroA*numeroB);
        }else if (subEntrada[0].equals("DIVIDE")){
            System.out.printf("A divisão de %.2f por %.2f eh: %.2f\n", numeroA, numeroB, numeroA/numeroB);
        }else{
            System.out.println("Entrada de operação inválida");
        }

        System.out.printf("SISTEMA ENCERRADO!!!\n");


        ler.close();
    }

    
}
