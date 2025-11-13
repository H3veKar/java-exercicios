/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-2 2 bimeste
 */
import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz [][]  = new int[10][10],i,j;
        double somaD = 0,mediaD;

        for ( i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.println("Digite o numero");
                matriz[i][j] = input.nextInt();
            }
        }
        for ( i = 0; i < 10; i++) {
            somaD += matriz[i][i];
        }

        mediaD =somaD / 10;



        System.out.println(" Média dos elementos da diagonal principal: " + mediaD);
    }
}

