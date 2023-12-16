import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Exercicio04 {
    public static void main(String[] args) {
        String[] nomesDosCandidatos = new String[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nomesDosCandidatos.length ; i++) {
            System.out.printf("Digite o nome do %dº candidato: %n", (i+1));
            nomesDosCandidatos[i] = input.nextLine();
        }

        Map<String, Integer> votacao = new HashMap<>();

        for (String candidato : nomesDosCandidatos) {
            votacao.put(candidato, 0);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor, digite o nome do candidato em quem você irá votar: ");
            String voto = input.nextLine();

            if (votacao.containsKey(voto)) {
                votacao.put(voto, (votacao.get(voto) + 1));
            } else {
                System.out.println("voto nulo.");
            }
        }

        String candidatoVencedor = null;
        int votosValidos = 0;

        for (Map.Entry<String, Integer> entry : votacao.entrySet()) {
            String nomeDoCandidato = entry.getKey();
            int votos = entry.getValue();

            if (votos > votosValidos) {
                votosValidos = votos;
                candidatoVencedor = nomeDoCandidato;
            }
        }

        double porcentagemDeVotosDoVencedor = (double) votosValidos * 100 / 10;

        System.out.printf("O candidato %s venceu com %.2f %% dos votos %n", candidatoVencedor, porcentagemDeVotosDoVencedor);
    }
}
