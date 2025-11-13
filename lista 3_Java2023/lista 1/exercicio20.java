import java.util.Scanner;
public class exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10],i=0,numero, s[] = new int[10],p=0;
        while(i!=10){
            System.out.println("qual o numero");
            numero= input.nextInt();
            if(numero>=0 && numero<=50) {
                n[i] = numero;
                i = i+1;
            }

        }
        for(i=0;i<10;i++){
           if((n[i]%2)!=0){
               s[p] = n[i];
               p = p+1;
           }
        }
        for(i=0;i<p;i++){
            System.out.println("os elementos do primeiro vetor e"+n[i]+ " e do segundo vetor"+s[i]);
        }
        for(i=p;i<10;i++){
            System.out.println("os elementos do primeiro vetor e"+n[i]);
        }
    }
}
