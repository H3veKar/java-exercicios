/*
Aluno: Hevellyn Karinne Ribeiro Castro
Turma: 2° informatica
 exercicio 40
 */
import java.util.Scanner;
public class exc40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String d,v;
        System.out.print("qual o destino ");
        d = input.next();
        System.out.print("a viagem  so ida ou ida e volta ");
        v = input.next();
        if(d.equals("norte")){
            if(v.equals("ida"))
                System.out.print("500");
            else  System.out.print("900");
        }

        else if(d.equals("nordeste") || (d.equals("centro-oeste"))){
            if(v.equals("ida"))
                System.out.print("350");

            else if (d.equals("nordeste"))
                System.out.print("650");

            else  System.out.print("600");
        }

        else if(d.equals("sul")){
            if(v.equals("ida"))
                System.out.print("300");
            else  System.out.print("550");
        }
    }
}
