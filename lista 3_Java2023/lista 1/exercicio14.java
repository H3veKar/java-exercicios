import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10], a[] = new int[10], p=0,k,t=0,
                repetido=0;
        for(int i=0; i<10; i++){
            System.out.println("Qual o valor?");
            n[i] = input.nextInt();
        }

        for(int i=0; i<10; i++){

            for(int j=0; j<10; j++){
                if(i!=j){
                    if(n[i] == n[j]){
                        repetido = 1 ;
                    }}
            }
            for(k=0;k<p;k++){
                if(a[k]==n[i])
                    t =1;
            }
            if(repetido!=0 && t!=1){
                a[p] = n[i];
                p++;
            }
            repetido = 0;
            t = 0;
        }

        System.out.println("Os numeros  repetidos sao:");
        for(int i=0; i<p; i++){
            System.out.println(a[i]);
        }
    }
}