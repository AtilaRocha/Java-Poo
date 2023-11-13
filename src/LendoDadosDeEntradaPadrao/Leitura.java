package src.LendoDadosDeEntradaPadrao;
import java.util.Scanner;
public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade: ");
        String idade = leitor.nextLine();

        System.out.println("Digite o peso: ");
        String peso = leitor.nextLine();

        System.out.println("O nome digitado foi: "+nome+" e a idade foi: "+idade+" e o peso foi: "+peso);
    }
}
