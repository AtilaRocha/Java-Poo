package exercicios.ex01;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado;
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print ("Digite o segundo número: ");
        int num2 = scanner.nextInt ();

        System.out.println ("Digite A para ADICIONAR, S para SUBITRAIR, e D para DIVIDIR ou R para tirar o RESTO.");
        String operacao = scanner.next().toUpperCase();
        switch (operacao){
            case "A" -> resultado = num1 + num2;
            case "S" -> resultado = num1 - num2;
            case "D" -> resultado = (num2 != 0) ? num1 / num2 : 0;
            case "R" -> resultado = (num2 != 0) ? num1 % num2 : 0;
            default -> {
                System.out.println ("Escolha uma opção valida.");
                return;
            }
        }
        System.out.println ("Resultado: "+ resultado);
    }
}
