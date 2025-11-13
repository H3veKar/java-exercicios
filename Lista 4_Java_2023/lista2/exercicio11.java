/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-2 2 bimeste
 */
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        int idadesA[]  = new int[8], codigosD []  = new int[5],quantidadeP[][]  = new int[8][5],codigoDb,
                alunos= 0,de=0,i;
        Scanner input = new Scanner(System.in);


        for (i = 0; i < 8; i++) {
            System.out.println("Digite as idades ");
            idadesA[i] = input.nextInt();
        }


        for ( i = 0; i < 5; i++) {
            System.out.println("Digite os códigos ");
            codigosD[i] = input.nextInt();
        }


        for ( i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite a quantidade de provas feitas por cada aluno em cada disciplina:");
                quantidadeP[i][j] = input.nextInt();
            }
        }



        System.out.print("Digite o código da disciplina que deseja  ");
        codigoDb= input.nextInt();


        for ( i = 0; i < 5; i++) {
            if (codigoDb == codigosD[i]) {
                de = 1;
            }
        }

        if (de == 1) {
            for ( i = 0; i < 8; i++) {
                if (idadesA[i] >= 18 && idadesA[i] <= 25) {
                    if (quantidadeP[i][codigoDb - 1] > 2) {
                        alunos=alunos+1;
                    }
                }
            }
            System.out.println("Quantidade de alunos com idade entre 18 e" +
                    " 25 anos que fizeram mais de duas provas na disciplina " + codigoDb + ": " + alunos);
        } else {
            System.out.println("O código digitado não existe.");
        }



        for ( i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                if (quantidadeP[i][j] < 3) {
                    System.out.println("Aluno " + (i + 1) + "  Disciplina " + codigosD[j]);
                }
            }
        }

    }
}