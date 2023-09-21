import java.util.Scanner;

public class CalculandoCustosAWS {
    public static void main(String[] args) {

        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        Scanner scanner = new Scanner(System.in);

        int quantidadeServidores = scanner.nextInt();

        int quantidadeBancosDados = scanner.nextInt();

        double custoTotal = calcularCustoTotal(quantidadeServidores, quantidadeBancosDados, custoPorHoraServidor, custoPorHoraBancoDados);

        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        scanner.close();
    }

    public static double calcularCustoTotal(int quantidadeServidores, int quantidadeBancosDados, double custoPorHoraServidor, double custoPorHoraBancoDados) {
        return ((quantidadeServidores*custoPorHoraServidor)+(quantidadeBancosDados*custoPorHoraBancoDados));
    }
}