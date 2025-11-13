/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 15
 */
import java.util.Scanner;
public class exc15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s,h,m1,m, t,s1;
        System.out.println("qual os segundos");
        s = input.nextInt();
        h = s/3600;
        m = s%3600;
        m1 = m/60;
        s1 = m%60;
        System.out.println("O total sao horas "+h+"Minutos"+m1+"e segundos"+s1);





    }
}
