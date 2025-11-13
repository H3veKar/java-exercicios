import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int V[] = new int[10], div=0,i;
        for(i=0;i<10;i++){
            System.out.println("qual o valor");
            V[i] = input.nextInt();
            if((V[i]%2)==0)
                div = div +1;
        }
        System.out.println("possue, "+div+ " valores pares");

    }
}
