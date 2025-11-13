/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 16
 */
import java.util.Scanner;
public class exc16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, menor=0, meio=0, maior=0;
        System.out.println(" informe a");
        a = input.nextDouble();
        System.out.println(" informe b");
        b = input.nextDouble();
        System.out.println(" informe c");
        c = input.nextDouble();

        if(a<b && a<c) {
            menor = a;
            if(b<c) {
                meio = b;
                maior = c;
            }
            else if(c<b) {
                meio = c;
                maior = b;
            }
        }
        else if(b<a && b<c){
            menor = b;
            if(c<a){
                meio = c;
                maior = a;
            }
            else if(a<c){
                meio = a;
                maior = c;
            }
        }
        else if (c< a && c<b){
            menor = c;
            if (a<b){
                meio = a;
                maior = b;
            }
            else if(b<a){
                meio = b;
                maior = a;
            }

        }
        System.out.println("a ordem e "+menor+"e"+meio+"e"+maior);


    }
}
