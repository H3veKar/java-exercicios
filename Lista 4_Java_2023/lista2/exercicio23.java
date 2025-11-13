/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[][] = new int[4][5], b[] = new int[5],i,j,soma=0;
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.println("qual o numero");
                a[i][j] = input.nextInt();
            }
        }
        for(j=0;j<5;j++){
             soma =0;
            for(i=0;i<4;i++){
               soma = soma + a[i][j];

            }
            b[j] = soma;

        }
        for(i=0;i<5;i++){
            System.out.println("soma  coluna "+(i+1)+"e de "+b[i]);
        }
    }
}
