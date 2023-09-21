import java.util.Scanner;

public class CalculadoraVelocidadeDownload {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distanciaServidores = scanner.nextDouble();

        double velocidadePlano = scanner.nextDouble();

        double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

        System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");
        scanner.close();
    }
    public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
        return (velocidadePlano / (1 + (distanciaServidores / 100)));
    }
}