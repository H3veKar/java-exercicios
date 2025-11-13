/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 32
 */
import java.util.Scanner;
public class exc32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c,A=0,B=0,C=0;
        System.out.println("qual o valor a ");
        a= input.nextDouble();
        System.out.println("qual  o valor b ");
        b= input.nextDouble();
        System.out.println("qual o valor c ");
        c= input.nextDouble();

        if((a+b)>c && (b+c)>a && (a+c)>b){

            System.out.println("pode ser triangulo");
                if((b*b+c*c)==a*a){
                    A = 90;
                    B = Math.toDegrees(Math.atan(b/c));
                    C = 180 - (A+B);

                }
                else if((c*c+a*a)==b*b){
                    B = 90;
                    A = Math.toDegrees(Math.atan(a/c));
                    C = 180 - (A+B);

                }
                else if((a*a+b*b)==c*c){
                    C = 90;
                    A = Math.toDegrees(Math.atan(a/b));
                    B = 180 - (A+C);

                }



        }
        System.out.println("O valor dos angulos sao "+A+"e"+B+"e"+C );

    }

}
