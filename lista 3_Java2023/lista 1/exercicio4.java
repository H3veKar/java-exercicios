import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int V[] = new int[8], x,y,soma=0,i;
        System.out.println("qual x");
        x = input.nextInt();
        System.out.println("qual y");
        y = input.nextInt();
        for(i=0;i<8;i++){
            System.out.println("qual o numero");
            V[i] = input.nextInt();
            soma = V[x] + V[y];
        }
        System.out.println("o resulatado da soma e"+soma);
    }
}
