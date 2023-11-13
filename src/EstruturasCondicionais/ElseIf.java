package src.EstruturasCondicionais;

public class ElseIf {
    public static void main(String[] args) {
        int idade1 = 100, idade2 = 100;

        if (idade1 > idade2) {
            System.out.println("A idade1 é maior que a idade2");
        } else if (idade2 > idade1) {
            System.out.println("A idade2 é maior que a idade1");
        }else {
            System.out.println("A idade1 é igual a idade2");
        }
    }
}
