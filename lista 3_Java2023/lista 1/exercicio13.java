import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[5],maior=-9999,menor=999999,i,indice=0,indice1=0;
        for(i=0;i<5;i++){
            System.out.println("qual o numero");
            n[i] = input.nextInt();

            if(n[i]>maior){
                maior = n[i];
                indice = i;}
            if(n[i]<menor){
                menor = n[i];
                indice1= i;           }

        }

        System.out.println("o maior numero esta na posicao "+indice+ "e o menor esta na posicao "+indice1);
    }
}
