/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] = new int[2][4], i,j,c=0,c1=0,co=0;
        for(i=0;i<2;i++){
            for(j=0;j<4;j++){
                System.out.println("qual o numero");
                A[i][j]= input.nextInt();

            }
        }
        for(i=0;i<2;i++){
            c = 0;

            for(j=0;j<4;j++){
                if(A[i][j]%2 == 0){
                    c1 = c1+1;
                    co = co +1;}
           if( A[i][j]>=12 && A[i][j]<=20){
               c = c +1;
           }


            }
            System.out.println("elementos entre 15 e 20 na linha "+(i+1)+ " e de "+c);
        }
        c1 = c1/co;
            System.out.println(" a media dos elementos pares da matriz "+c1);
    }

}
