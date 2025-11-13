import java.util.Scanner;
public class exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10], i, M[] = new int[10], a,j=0;
        System.out.println("informe um numero");
         a= input.nextInt();

        for(i=0;i<10;i++){
            System.out.println("qual o numero");
            n[i] = input.nextInt();
            if((n[i]%a)==0){
                M[j] = n[i];
                j = j+1;}

        }
        for(i=0;i<j;i++){
            System.out.println(" os numeros que sao multiplos sao"+M[i]);
        }

    }
}
