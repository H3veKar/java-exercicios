import java.util.Scanner;
public class exercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n[] = new int[10], a[]= new int[10],i,maior_n=0,maior_a=0,maior_na=0,maior_an=0;
        for(i=0;i<10;i++){
            System.out.println("qual o numero do aluno");
            n[i]= input.nextInt();
            System.out.println("qual a altura do aluno");
            a[i]= input.nextInt();
            if(n[i]>maior_n){
                maior_n = n[i];
                maior_na = a[i];

            if(a[i]>maior_a){
                maior_a = a[i];
                maior_an = n[i];
            }
            }
        }
        System.out.println("o aluno de maior numero e "+maior_n+ " e sua altura e"+maior_na);
        System.out.println("o aluno de maior altura e "+maior_a+ " e seu numero e "+maior_an);

    }
}
