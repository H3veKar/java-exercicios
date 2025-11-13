/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10],i,c=0,j;
        for(i=0;i<10;i++){
            System.out.println("qual o valor");
            n[i] = input.nextInt();

        }
        for(i=0;i<10;i++){
            for(j=2;j<=n[i];j++){
                if((n[i]%j) ==0)
                    c = c+1;
            }
            if(c == 1)
            System.out.println("numero primo"+n[i]);
            c = 0;

        }


    }
}
