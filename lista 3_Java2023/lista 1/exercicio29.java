/*Aluna : Hevellyn Karinne Ribeiro Castro
  Turma: 2 de informática
  Lista-1 2 bimeste
 */
import java.util.Scanner;
public class exercicio29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v[] = new int[6],i,soma=0,quant=0;
        for(i=0;i<6;i++){
            System.out.println("informe o numero");
            v[i]= input.nextInt();
            if(v[i]%2==0){
                System.out.println(v[i] +" e par");
                soma = soma + v[i];
            }
            else{
                System.out.println(v[i]+ " e impar");
                quant = quant +1;
            }
        }
        System.out.println(" a quantidade de numeros impes sao "+quant+" e a soma de numeros pares sao "+soma);

    }
}
