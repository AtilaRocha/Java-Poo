package exercicios.ex02;
import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] idadeAlunos = {10, 11, 13, 12, 11};

        double media = calcularMedia(idadeAlunos);
        System.out.println("Média das idades: " + media);

        int acimaDaMedia = contarAcimaDaMedia(idadeAlunos, media);
        System.out.println("Quantidade de alunos acima da média: " + acimaDaMedia);
    }
    // Função para calcular a média dos itens em um array de inteiros
    public static double calcularMedia(int[] array) {
        int soma = Arrays.stream(array).sum();
        return (double) soma / array.length;
    }
    // Função para contar quantos valores estão acima da média
    public static int contarAcimaDaMedia(int[] array, double media) {
        int count = 0;
        for (int valor : array) {
            if (valor > media) {
                count++;
            }
        }
        return count;
    }
}
