package src.EstruturasCondicionais;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int caso = 0;
        System.out.println("Digite 1 para mostrar o nome Atila, 2 para mostrar o nome Darah, e 3 para mostrar o nome Adler");
        caso = leitor.nextInt();
        switch (caso) {
            case 1 -> System.out.println("Atila");
            case 2 -> System.out.println("Darah");
            case 3 -> System.out.println("Adler");
            default -> System.out.println("Valor não encontrado no menu");
        }
    }
}
