import java.util.Scanner;

public class Uni3Exe18 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em quilômetros: ");
        double distanciaPercorrida = sc.nextDouble();

        System.out.print("Digite o tempo gasto em minutos: ");
        double minutosGastos = sc.nextInt();

        double horas = minutosGastos / 60;
        double velocidadeMedia = distanciaPercorrida / horas;
        double ritmoMedio = minutosGastos / distanciaPercorrida;

        System.out.println("Tempo em horas: " + horas);
        System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
        System.out.println("Ritmo médio: " + ritmoMedio + " min/km");

        sc.close();
    }
}
