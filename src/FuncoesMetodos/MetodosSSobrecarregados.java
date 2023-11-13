package src.FuncoesMetodos;

public class MetodosSSobrecarregados {
    public static void main(String[] args) {
        System.out.println (soma(1,2));
        System.out.println (soma(1.0,2.0));
        System.out.println (soma(1,2,3));
    }
    public static int soma (int a, int b) {
        return a + b;
    }
    public static double soma (double a, double b) {
        return a + b;
    }
    public static int soma (int a, int b, int c) {
        return a + b + c;
    }
}
