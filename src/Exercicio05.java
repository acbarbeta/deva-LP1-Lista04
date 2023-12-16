import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos elementos seu array terá?");
        int numeroDeElementos = input.nextInt();

        int[] numeros = new int[numeroDeElementos];

        for (int i = 0; i < numeroDeElementos ; i++) {
            System.out.printf("Digite o %dº elemento: %n", (i+1));
            numeros[i] = input.nextInt();
        }

        int indiceDoPivot = encontraPivot(numeros);
        System.out.printf("Índice do Pivot: %d", indiceDoPivot);
    }

    public static int encontraPivot(int[] numeros) {
        int somaTotal = 0;
        int somaLadoEsquerdo = 0;

        for (int numero : numeros) {
            somaTotal += numero;
        }

        for (int i = 0; i < numeros.length ; i++) {
            somaTotal -= numeros[i];

            if (somaTotal == somaLadoEsquerdo) {
                return i;
            }

            somaLadoEsquerdo += numeros[i];
        }

        return -1;
    }
}
