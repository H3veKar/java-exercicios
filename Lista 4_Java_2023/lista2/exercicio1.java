/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] = new int[3][5], i,j,cont=0;
        for(i=0;i<3;i++){
            for(j=0;j<5;j++){
                System.out.println("qual o numero");
                A[i][j]= input.nextInt();
                if(A[i][j]>=15 && A[i][j]<=20){
                    cont = cont +1;
                }
            }

        }
        System.out.println(" a quantidade de elementos entre 15 e 20 e de "+cont);



    }
}
