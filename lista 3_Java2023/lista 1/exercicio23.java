import java.util.Scanner;
public class exercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[5], b[] = new int[5], c[] = new int[5],i,resultado=0;
        for(i=0;i<5;i++){
            System.out.println("qual o numeo do vetor a");
            a[i]= input.nextInt();
            System.out.println("qual o numeo do vetor b");
            b[i]= input.nextInt();
            c[i] = a[i]*b[i];
            resultado = resultado + c[i];

        }

            System.out.println("o peoduto escalar e "+resultado);
    }
}
