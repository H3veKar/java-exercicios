import java.util.Scanner;
public class exercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[10], b[] = new int[10], c[] = new int[20],i,p=0,p1=0;
        for(i=0;i<10;i++){
            System.out.println("qual o numeo do vetor a");
            a[i]= input.nextInt();
            System.out.println("qual o numeo do vetor b");
            b[i]= input.nextInt();

        }
        for(i=0;i<20;i++){
            if((i%2)==0){
                c[i] = a[p];
                p = p+1;
            }
            else{
                c[i] = b[p1];
                p1= p1+1;
            }

        }
        for(i=0;i<20;i++){
            System.out.println("os valores do vetor c e"+c[i]);
        }
    }
}
