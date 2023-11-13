package src.EstruturasCondicionais;
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira idade: ");
        int idade1 = scanner.nextInt();
        System.out.print("Digite a segunda idade: ");
        int idade2 = scanner.nextInt();
        String maisVelha = (idade1 > idade2) ? "A primeira pessoa("+idade1+") é mais velha." : "A segunda pessoa("+idade2+") é mais velha.";
        System.out.println(maisVelha);
        scanner.close();
    }
}
