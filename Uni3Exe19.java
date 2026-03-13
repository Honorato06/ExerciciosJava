import java.util.Scanner;

public class Uni3Exe19 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário mensal do funcionário: R$ ");
        double salarioMensal = sc.nextDouble();

        System.out.print("Digite o número de meses trabalhados no ano: ");
        int mesesTrabalhados = sc.nextInt();

        double terceiro = (salarioMensal / 12) * mesesTrabalhados;

        System.out.println("O valor do 13° salário é R$ " + terceiro);

        sc.close();
    }
}
