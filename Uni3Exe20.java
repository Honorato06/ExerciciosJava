import java.util.Scanner;

public class Uni3Exe20 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        final double gasolina = 5.75;
        final double etanol = 4.29;

        System.out.print("Digite a quantidade de litros de gasolina: ");
        double litrosGasolina = sc.nextDouble();

        System.out.print("Digite a quantidade de litros de etanol: ");
        double litrosEtanol = sc.nextDouble();

        double valorGasolina = litrosGasolina * gasolina;
        double valorEtanol = litrosEtanol * etanol;
        double valorTotal = valorEtanol + valorGasolina;

        System.out.println("Valor gasolina: R$ " + valorGasolina);
        System.out.println("Valor etanol: R$ " + valorEtanol);
        System.out.println("Valor total: R$ " + valorTotal);

        sc.close();
    }
}
