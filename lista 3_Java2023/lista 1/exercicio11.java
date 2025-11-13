import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10], soma=0, quant=0,i;
        for(i=0;i<10;i++){
            System.out.println("qual o numero");
            n[i] = input.nextInt();
            if(n[i]<0)
                quant = quant+1;
            else if (n[i]>0)
                soma = soma + n[i];
        }
        System.out.println("a soma dos numeros positivos sao "+soma);
        System.out.println("a quantidade de numeros negativos sao "+quant);

    }
}
