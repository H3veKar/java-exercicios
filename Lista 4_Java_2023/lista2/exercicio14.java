/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;

public class exercicio14{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz [][]  = new int[12][13],i,j,maior,el=0;


        for ( i = 0; i < 12; i++) {
            for ( j = 0; j < 13; j++) {
                System.out.println("Digite o numero ");
                matriz[i][j] = input.nextInt();
            }
        }


        for ( i = 0; i < 12; i++) {
            maior= Math.abs(matriz[i][0]);
            for (j = 1; j < 13; j++) {
                el = Math.abs(matriz[i][j]);
                if (el > maior) {
                    maior = el;
                }
            }
            for (j = 0; j < 13; j++) {
                matriz[i][j] = matriz[i][j] / maior;
            }
        }


        for ( i = 0; i < 12; i++) {
            for ( j = 0; j < 13; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}