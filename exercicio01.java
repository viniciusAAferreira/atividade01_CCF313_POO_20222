
import java.util.Scanner;

public class exercicio01{

    public static void main(String[] args){

        int anoNascimento;
        int anoAtual;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento:");
        anoNascimento = ler.nextInt();

        System.out.println("Digite o ano atual:");
        anoAtual = ler.nextInt();

        System.out.printf("Sua idade é: %d\n", anoAtual - anoNascimento);
    }
}