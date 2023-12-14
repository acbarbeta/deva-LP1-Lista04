import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("São quantos alunos?");
        int numeroDeAlunos = input.nextInt();

        System.out.println("São quantas notas por aluno? ");
        int numeroDeNotas = input.nextInt();

        double[][] turma = new double[numeroDeAlunos][numeroDeNotas];

        for (int i = 0; i < numeroDeAlunos ; i++) {
            for (int j = 0; j < numeroDeNotas ; j++) {
                System.out.printf("Insira o valor da nota %d do aluno %d: ", (j+1), (i+1) );
                turma[i][j] = input.nextDouble();
            }
        }

        calculaMediaDosAlunos(turma, numeroDeNotas, numeroDeAlunos);
    }

    public static void calculaMediaDosAlunos(double[][] turma, int numeroDeNotas, int numeroDeAlunos) {

        double notaTotalDaTurma = 0;

        for (int i = 0; i < numeroDeAlunos ; i++) {

            double notaTotalDoAluno = 0;

            for (int j = 0; j < numeroDeNotas; j++) {
                notaTotalDoAluno += turma[i][j];
            }

            double mediaDoAluno = notaTotalDoAluno / numeroDeNotas;
            System.out.printf("Aluno %d - Média %.2f%n", (i+1), mediaDoAluno);

            notaTotalDaTurma += mediaDoAluno;

        }

        double mediaDaTurma = notaTotalDaTurma / numeroDeAlunos;

        System.out.println();
        System.out.printf("Média da turma: %.2f", mediaDaTurma);




    }
}
