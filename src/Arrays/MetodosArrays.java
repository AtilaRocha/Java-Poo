package src.Arrays;
import java.util.Arrays;

public class MetodosArrays {
    public static void main(String[] args) {

        int[] idadeAlunos = new int[5];

        idadeAlunos[0] = 10;
        idadeAlunos[1] = 11;
        idadeAlunos[2] = 13;
        idadeAlunos[3] = 12;
        idadeAlunos[4] = 11;

        System.out.println(idadeAlunos.length);
        //mostra o tamanho do array.

        System.out.println(Arrays.toString(idadeAlunos));
        //Retorna [10, 11, 13 , 12, 11]

        int[] idadeAlunos2 = Arrays.copyOf(idadeAlunos, 10);
        //IdadeAlunos2 vai ter os mesmos valores mas invés de 5 irá ter 10 de tamanho.

        Arrays.sort(idadeAlunos);
        //idadeAlunos agora estão em ordem crescente
    }
}
