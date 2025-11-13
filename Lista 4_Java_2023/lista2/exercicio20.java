/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-2 2 bimeste
 */
import java.util.Scanner;
public class exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double M[][] = new double[5][5], dp=0;
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.println("digite um valor");
                M[i][j] = input.nextInt();

            }
        }
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(i==j)
                    M[i][j] = dp;
            }
        }
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                M[i][j] = M[i][j]*dp;
                System.out.println("a matriz depois "+M[i][j]);
            }
        }


    }
}

