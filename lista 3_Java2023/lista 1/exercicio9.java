import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[6] , M[] = new int[6],i,j=5;
        for(i=0;i<6;i++){
            System.out.println("qual o numero");
            n[i] = input.nextInt();
            if((n[i]%2)!=0){
                System.out.println("o numero nao e par, digite novamente");
                n[i] = input.nextInt();
            }
            System.out.println(+n[i]);
            if((i+j)==5) {
                M[j] = n[i];
                j = j - 1;
            }
        }

        for(j=0;j<6;j++){
            System.out.println(" a ordem invertida e"+M[j]);}
    }
}
