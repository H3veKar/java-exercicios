/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] = new int[6][3], i,j,l=0,c=0,c1=0,l1=0,maior=-99999,menor=-999999;
        for(i=0;i<6;i++){
            for(j=0;j<3;j++){
                System.out.println("qual o numero");
                A[i][j]= input.nextInt();
                if(A[i][j]> maior) {
                    maior = A[i][j];
                    l = i+1;
                    c = j+1;

                }
                if(A[i][j]<menor) {
                    menor = A[i][j];
                    l1 = i+1;
                    c1 = j+1;
                }
            }

        }
        System.out.println("O maior numero e "+maior + "na linha "+l+ " e na coluna "+c);
        System.out.println("O menor numero e "+menor + "na linha "+l1+ " e na coluna "+c1);
    }
}
