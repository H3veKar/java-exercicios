import java.util.Scanner;
public class exeercicio26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vet[] =  new int[10],i,soma=0,somadpa=0,dp;
        double media;
        for(i=0;i<10;i++){
            System.out.println(" informe o valor do vetor"+(i+1));
            vet[i]= input.nextInt();
            soma  = soma + vet[i];
        }
        media =  soma/i;
        for(i=0;i<10;i++){
            somadpa = somadpa+ pow((vet[i]-media),2);
        }
        dp = sqrt(1/(i-1)*somadpa);
        System.out.println(" o desvio padrao e igual a "+dp);
    }
}
