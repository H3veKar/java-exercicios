/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 22
 */
import java.util.Scanner;
public class exc22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s, c=0;
        System.out.println("qual o saldo medio ");
        s= input.nextDouble();
        if (s>=0 && s<=500)
           c = 0;

        else if (s>500 && s<=1000)
            c = s*0.3;


        else if (s>1000 && s<=3000)
            c = s*0.4;

        else if (s>3000)
            c = s*0.5;


        System.out.println(" credito"+c);
    }
}
