/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 26
 */
import java.util.Scanner;
public class exc26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("qual sua idade ");
        i= input.nextInt();
        if(i<=10)
            System.out.println("30 reais ");
        else if(i>10 && i<=29)
            System.out.println("60 reais ");
        else if(i>29 && i<=45)
            System.out.println("120 reais ");
        else if(i>45 && i<=59)
            System.out.println("150 reais ");
        else if (i>59 && i<=65)
            System.out.println("250 reais");
        else if (i>65)
            System.out.println("400 reais");
        else System.out.println("idade invalida  ");

    }
}
