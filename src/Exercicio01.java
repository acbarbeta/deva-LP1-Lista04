import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Quantos elementos os Arrays terão?");
        int numeroDeElementos = input.nextInt();

        if (numeroDeElementos == 0) {
            System.out.println("Arrays não podem ser nulos!");
        } else {

            int[] arrayA = new int[numeroDeElementos];
            int[] arrayB = new int[numeroDeElementos];

            for (int a = 0; a < numeroDeElementos ; a++) {
                System.out.println("Digite o valor " + (a+1) +": ");
                int valorNaPosicao = input.nextInt();
                arrayA[a] = valorNaPosicao;
            }

            for (int b = 0; b < numeroDeElementos ; b++) {
                System.out.println("Digite o valor " + (b+1) +": ");
                int valorNaPosicao = input.nextInt();
                arrayB[b] = valorNaPosicao;
            }

            CriaArrayFinal(arrayA, arrayB, numeroDeElementos);

        }

    }

    public static void CriaArrayFinal(int [] arrayA, int[] arrayB, int numeroDeElementos) {
        System.out.print("[");
        for (int i = 0; i < numeroDeElementos ; i++) {
            System.out.print(arrayA[i]);
            System.out.print(",");
            System.out.print(arrayB[i]);
            if (i < numeroDeElementos-1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

}