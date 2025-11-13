import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10], i;
        for(i=0;i<10;i++){
            System.out.println("qual o numero");
            n[i] = input.nextInt();
            if(n[i]<0)
                n[i]=0;
        }
        for(i=0;i<10;i++){
            System.out.println("os valores finais do vetor "+n[i]);
        }

    }
}
