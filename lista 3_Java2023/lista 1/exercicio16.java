import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[5],i, codigo,j=4, M[] = new int[5];

        for(i=0;i<5;i++){
            System.out.println("qual o numero");
            n[i] = input.nextInt();
        }
        System.out.println("qual o codigo");
        codigo = input.nextInt();
        while(codigo!=0){
            if(codigo==1){
                for(i=0;i<5;i++) {
                    System.out.println("a ordem e" + n[i]);
                }
                }
            else if(codigo == 2){
                    for(i=0;i<5;i++){
                    if((i+j)==4) {
                        M[j] = n[i];
                        j = j - 1;}}
                    for(j=0;j<5;j++){
                            System.out.println(" a ordem invertida e"+M[j]);}

                }
            else
                System.out.println("codigo invalido");
            System.out.println("qual o codigo");
            codigo = input.nextInt();

        }

    }
}
