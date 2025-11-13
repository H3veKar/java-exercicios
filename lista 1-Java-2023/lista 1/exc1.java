/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 1
 */
import java.util.Scanner;
public class exc1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float n1, n2, n3, n4, p1, p2, p3, p4, mp;
        System.out.println("informe a nota 1");
          n1 = input.nextFloat();
        System.out.println("informe a nota 2 ")  ;
          n2 = input.nextFloat();
        System.out.println("informe a nota 3");
          n3 = input.nextFloat();
        System.out.println("informe a nota 4")  ;
          n4 = input.nextFloat();
        System.out.println("informe o peso 1");
          p1 = input.nextFloat();
        System.out.println("informe o peso 2")  ;
          p2 = input.nextFloat();
        System.out.println("informe o peso 3");
          p3 = input.nextFloat();
        System.out.println("Informe o peso 4");
          p4 = input.nextFloat();
          mp = ((p1*n1)+(p2*n2)+(p3*n3)+(p4*n4))/(p1+p2+p3+p4);
          System.out.println("a media ponderada e"+mp);

    }
}

