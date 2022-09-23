import java.util.Scanner;

public class exercicio03 {
    
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        float salarioCliente;
        float valorPedidoEmprestimo;

        System.out.println("Digite o sálario do cliente:");
        salarioCliente = ler.nextFloat();
        
        System.out.println("Digite o valor do pedido de empréstimo do cliente:");
        valorPedidoEmprestimo = ler.nextFloat();

        ler.close();
        if((salarioCliente*0.3) >= valorPedidoEmprestimo){
            System.out.println("Empréstimo aprovado!!!");
        }
        else{
            System.out.println("Impossível valor do empréstimo com esse sálario!");
        }

    }

}
