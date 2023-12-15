import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos elementos o array terá? ");
        int numeroDeElementos = input.nextInt();

        int[] nums = new int[numeroDeElementos];

        for (int i = 0; i < numeroDeElementos; i++) {
            System.out.printf("Digite o %dº elemento: %n", (i+1));
            nums[i] = input.nextInt();
        }

        calculaSomaAcumulada(nums, numeroDeElementos);
    }

    public static void calculaSomaAcumulada(int[] nums, int numeroDeElementos) {

        int somaAcumulada = 0;
        int[] arrayDaSoma = new int[(numeroDeElementos)];

        for (int i = 0; i < numeroDeElementos ; i++) {
            somaAcumulada += nums[i];
            arrayDaSoma[i] = somaAcumulada;
        }

        System.out.println(Arrays.toString(arrayDaSoma));
    }
}
