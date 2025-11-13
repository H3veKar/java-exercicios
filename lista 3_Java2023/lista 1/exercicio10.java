import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[15], media=0, i;
        for(i=0;i<15;i++){
            System.out.println("qual o numero");
            n[i] = input.nextInt();
            media = media + n[i];
        }
        media = media/15;
        System.out.println("a media geral e"+media);
    }
}
