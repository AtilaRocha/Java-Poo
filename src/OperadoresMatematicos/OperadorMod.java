package src.OperadoresMatematicos;

public class OperadorMod {
    public static void main(String[] args) {
        int mod = 10%3;
        System.out.println("O resto do valor da divisão é 10 / 3 = "+mod);

        int num1 = 10,num2 = 3;
        int mod2 = num1%num2;
        System.out.println("O resto do valor da divisão é "+num1+" / "+num2+" = "+mod2);
    }
}
