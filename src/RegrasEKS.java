import java.util.Scanner;

public class RegrasEKS {
    public static void main(String[] args) {
        int podsPorNode = 10;
        int podsPorServidor = 4;

        Scanner scanner = new Scanner(System.in);

        int numeroTotalPodsint = scanner.nextInt();

        double numeroTotalPods = (double) numeroTotalPodsint;

        int numeroMinimoNodes = calcularNodes(numeroTotalPods);

        int numeroMinimoServidores = calcularServidores(numeroTotalPods);

        if (numeroMinimoNodes == 1) {
            System.out.println("1.Recomendamos usar um unico node");
        } else {
            System.out.println("1.Numero minimo de nodes:" + numeroMinimoNodes);
        }

        if (numeroMinimoServidores == 1) {
            System.out.println("2.Recomendamos usar um unico servidor");
        } else {
            System.out.println("2.Numero minimo de servidores:" + numeroMinimoServidores);
        }

    }

    public static int calcularNodes(double numeroTotalPods) {
        int numeroMinimoNodes = (int) Math.ceil(numeroTotalPods / 10);
        return numeroMinimoNodes;
    }

    public static int calcularServidores(double numeroTotalPods) {
        int numeroMinimoServidores = (int) Math.ceil(numeroTotalPods / 4);
        return numeroMinimoServidores;
    }
}