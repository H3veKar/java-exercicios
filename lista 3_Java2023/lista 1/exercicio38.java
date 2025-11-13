/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10],i, a[] = new int[10],j,b;
        for(i=0;i<10;i++) {
            System.out.println("qual o valor do vetor");
            n[i] = input.nextInt();
                for(j=0;j<=i;j++){
                    if(n[i]!=n[j]){
                    if(n[i]<n[j]){
                        b=  n[j] ;
                        n[j] = n[i];
                        n[i] = b;
                    }
                }}
        }
        for(i=0;i<10;i++){
            System.out.println(n[i]);
        }
    }
}
