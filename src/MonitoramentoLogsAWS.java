import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine();

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1].trim();
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L) + 1);
        }

        String maiorServico = eventosPorServico.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

        String menorServico = eventosPorServico.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();

        System.out.println("Eventos por servico:");
        eventosPorServico.forEach((servico, quantidade) -> {
            System.out.println(servico + ":" + quantidade);
        });

        System.out.println("Maior:" + maiorServico);
        System.out.println("Menor:" + menorServico);
    }
}
