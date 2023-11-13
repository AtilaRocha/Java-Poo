package src.Arrays;

import java.util.Arrays;

public class TamanhoArray {
    public static void main (String[] args) {
        String[] alunos = new String[4];
        alunos[0] = "Alberto";
        alunos[1] = "Gustavo";
        alunos[2] = "Lucas";
        alunos[3] = "Bruno";

        System.out.println("Temos "+alunos.length+" alunos no total.");
        System.out.println(Arrays.toString (alunos));
        //Exibe 4, que é o tamanho do array
    }
}
