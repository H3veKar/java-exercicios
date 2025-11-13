import java.util.Scanner;
public class exercicio36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,i,j,a=0,b=0;
        System.out.println("qual o tamanho do triangulo");
        numero= input.nextInt();
        int n[] = new int[numero];
        n[0] = 1;
        for(i=0;i<=numero;i++){
            for(j=0;j<=i;j++){
                b = a + n[j];
                a = n[j];
                n[j] = b;
                System.out.print(n[j] +"");
            }
        }
    }
}
