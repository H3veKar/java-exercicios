import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N[] = new int[6], j,i;
        for(i=0;i<6;i++){
            N[i]= input.nextInt();

        }
        for(i=0;i<6;i++)
            System.out.println(N[i]);
    }

}
