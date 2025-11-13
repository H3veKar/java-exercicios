import java.util.Scanner;
public class exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[50],i;
        for(i=0;i<50;i++){
            n[i] = (i+5*i)%(i+1);
            System.out.println("o resultado e "+n[i]);
        }
    }
}
