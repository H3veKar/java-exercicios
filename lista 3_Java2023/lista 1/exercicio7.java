import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10],maior=-100,i,p=0;
        for(i=0;i<10;i++){
            System.out.println("qual o valor");
            n[i] = input.nextInt();
            if(n[i]>maior){
                maior = n[i];
                p = i;}

        }
        System.out.println("maior e "+maior+"na pocisao"+p);
    }
}
