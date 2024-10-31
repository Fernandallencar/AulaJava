
import java.util.Scanner
public class QuintaClasse {

    public static void main (String[]args) {
        double nota2, nota3, nota4, nota5;

        Scanner notas = new Scanner(System.in);
        System.out.println("entre com a nota ");
        nota2 = notas.nextDouble();
        System.out.println("entre com a nota ");
        nota3 = notas.nextDouble();
        System.out.println("entre com a nota ");
        nota4 = notas.nextDouble();
        System.out.println("entre com a nota ");
        nota5 = notas.nextDouble();


        double  media = (nota2 + nota3 + nota4 + nota5)/4;
        System.out.println(" a media é " + media);

        if ( media >= 7){
            System.out.println("Você está aprovado! 👏 ");
        } else if (media >= 5){
            System.out.println("Você está de recuperação 😢");

    }



}
