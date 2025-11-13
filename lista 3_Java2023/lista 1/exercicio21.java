import java.util.Scanner;
public class exercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[10], b[] = new int[10], c[] = new int[10],i;
        for(i=0;i<10;i++){
            System.out.println("qual o numeo do vetor a");
            a[i]= input.nextInt();
            System.out.println("qual o numeo do vetor b");
            b[i]= input.nextInt();
            c[i] = a[i]-b[i];
        }
        for(i=0;i<10;i++){
            System.out.println("numeros do vetor c"+c[i]);
        }


    }
}
