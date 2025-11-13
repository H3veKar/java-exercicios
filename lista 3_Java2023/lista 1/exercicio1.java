
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A [] ={1,0,5,-2,-5,7}, soma=0, i ,r;
        soma = A[0] + A[1] +A[5];
        System.out.println(+soma);
        A[4] = 100;
        for(i=0;i<6;i++){
            System.out.println(A[i]);

        }

    }
}
