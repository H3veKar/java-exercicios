import java.util.Scanner;
public class ezercicio32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x[] = new int[5], y[] = new int[5], s[] = new int[5],i,j,c=0,b=0, d[] = new int[10],q=0,c1=1;

        for(i=0;i<5;i++) {
            System.out.println("informe o valor de x");
            x[i] = input.nextInt();
            System.out.println("informe o valor de y");
            y[i] = input.nextInt();


        }
        for(i=0;i<5;i++){
            s[i] = x[i] + y[i];
            System.out.println(" a soma e de "+s[i]);
        }
        for(i=0;i<5;i++){
            s[i] = x[i] * y[i];
            System.out.println("a multiplicacao does elementos e "+s[i]);
        }
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(x[i] != y[j]){
                    b = b+1;}
            }
            if(b>=5){
                d[c] = x[i];
                c = c+1;

            }
            b=0;
        }
        for(i=0;i<c;i++){
            System.out.println("elemento da diferenca entre x e y "+d[i]);
        }
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(x[i]==y[j]){
                    s[q] = x[i];
                    q = q+1;
                }
            }

        }
        for(i=0;i<q;i++){
            System.out.println("intessecao entre x e y "+s[i]);
        }
        for(i=0;i<10-c;i++){
            d[c+c1] = y[i];
            c1 = c1+1;
        }
        for(i=0;i)



    }

}
