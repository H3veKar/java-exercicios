import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N[] = new int[10], i, M[] = new int[10];
        for(i=0;i<10;i++){
            System.out.println("qual o numero");
            N[i] = input.nextInt();
            M[i] = N[i] * N[i];

        }
        for(i=0;i<10;i++){
            System.out.println("o numero informado foi"+N[i]);
            System.out.println("o resultado do quadrado e "+ M[i]);
        }
    }
}
