import java.util.Scanner;

public class SegundaClasse {

    public static void main( String[]arges){
        Scanner dados = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        String nome = dados.nextLine();

        System.out.println("Entre com sua idade: ");
        String idade = dados.nextLine();

        System.out.println("Entre com seu peso: ");
        String peso = dados.nextLine();

        System.out.println("Entre com sua altura: ");
        String altura = dados.nextLine();



        System.out.println("O seu nome é: " + nome );
        System.out.println("A sua idade é: " + idade);
        System.out.println("O seu  peso é: " + peso);
        System.out.println("A sua altura é: " + altura);
    }
}
