import java.util.Scanner;

public class Uni3Exe21 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso corporal em kg: ");
        double pesoCorporal = sc.nextDouble();

        System.out.print("Digite a altura da pessoa em metros: ");
        double altura = sc.nextDouble();

        double imc = pesoCorporal / (Math.pow(altura, 2));

        System.out.println("O IMC da pessoa é " + imc);

        sc.close();
    }
}
