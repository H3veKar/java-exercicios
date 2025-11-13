/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 16
 */
import java.util.Scanner;
public class exc16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dn, a, i, f;
        System.out.println("qual o ano de nascimento");
        dn = input.nextInt();
        System.out.println("qual o ano atual");
        a = input.nextInt();
        i = a - dn;
        f = a  + i;
        System.out.println("a idade e"+i);
        System.out.println("a pessoa tera em 2028 "+f);


    }
}
