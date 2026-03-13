import java.util.Scanner;

public class Uni3Exe17 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        final double valorCamiseta = 35.00;
        final double percentualDesconto = 10;

        System.out.print("Digite o total de camisetas que irá comprar: ");
        int qtdCamisetas = sc.nextInt();

        double valorSemDesconto = qtdCamisetas * valorCamiseta;
        double valorDesconto = (percentualDesconto * valorSemDesconto) / 100;
        double valorFinal = valorSemDesconto - valorDesconto;

        System.out.println("Valor total: R$ " + valorSemDesconto);
        System.out.println("Desconto aplicado: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);

        sc.close();
    }
}
