/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10],i,j,b;
        for(i=0;i<10;i++){
            System.out.println("qualo valor");
            n[i]= input.nextInt();
        }
        for(i=0;i<10;i++){
            for(j=i+1;j<10;j++){
                if(n[i]>n[j]){
                   b=  n[j] ;
                    n[j] = n[i];
                    n[i] = b;
                }
            }
        }
        for(i=0;i<10;i++){
            System.out.println(n[i]);
        }
    }
}
