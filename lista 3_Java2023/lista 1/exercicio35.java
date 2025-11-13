/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[6],a,b,i,n1[] = new int[5];
        System.out.println("qual e a ");
        a = input.nextInt();
        System.out.println("qual e b ");
        b = input.nextInt();
            if(a<=99){
               n[0]= a/10;
               n[1] = a%10;
            }
            else if(a<=999){
                n[0]= a/100;
                n[1] = (a%100)/10;
                n[2] = a%10;
            }
            else if(a<=9999){
                n[0]= a/1000;
                n[1] = (a%1000)/100;
                n[2] = (a%100)/10;
                n[3] = a%10;
            }

        if(b<=99){
            n1[0]= b/10;
            n1[1] = b%10;
        }
        else if(b<=999){
            n1[0]= b/100;
            n1[1] = (b%100)/10;
            n1[2] = b%10;
        }
        else if(b<=9999){
            n1[0]= a/1000;
            n1[1] = (b%1000)/100;
            n1[2] = (b%100)/10;
            n1[3] = b%10;
        }

            for(i=4;i>=0;i--){
                n[i] = n[i]+n1[i];
                if(n[i]>=10) {
                    n[i] = n[i] - 10;
                    n[i-1] = n[i-1]+1;

                }
            }
            for(i=0;i<5;i++){
                System.out.println(n[i]);
            }

    }

}
