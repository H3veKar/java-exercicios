/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 28
 */
import java.util.Scanner;
public class exc28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vc, vv=0;
        System.out.println("qual o valor ");
        vc= input.nextDouble();
        if(vc<10)
            vv = vc*0.7;

       else  if(vc>=10 && vc<30)
            vv=vc* 0.5;

        else if(vc>=30 && vc<50)
            vv= vc*0.4;

        else if(vc>50)
            vv= vc*0.3;


            System.out.println("o valor da venda e "+vv);

    }
}
