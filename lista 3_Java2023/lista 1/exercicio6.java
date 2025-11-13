import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10], menor=10000,maior=-100,i;
        for(i=0;i<10;i++){
            System.out.println("qual o valor");
            n[i] = input.nextInt();
            if(n[i]>maior)
                maior = n[i];
            if(n[i]<menor)
                menor = n[i];
        }
        System.out.println("maior e "+maior+ "e o menor e "+menor);
    }
}
