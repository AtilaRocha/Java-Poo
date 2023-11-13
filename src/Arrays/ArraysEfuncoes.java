package src.Arrays;

public class ArraysEfuncoes {
    public static int somaDosElementosDoArray(int[] idadeAlunos) {
        //Receber um array como parâmetro é como se tivesse criando outro array, mas sem a parte da atribuição.
        int acumularSoma = 0;
        for(int i = 0; i < 5; i++) {
            //Ele só funciona porque sabemos o tamanho do array, e se não soubessemos?
            acumularSoma = acumularSoma + idadeAlunos[i];
        }
        System.out.println (acumularSoma);
        return acumularSoma;
        /*
        Esse for é de extrema importância pois nele é possivel
        Somar todas as posições utilizando a variável de controle
        Testá-lo e tentar fazer ele sozinho é muito importante.
        */
    }

    public static void main(String[] args) {
        int[] idadeAlunos = new int[5];
        idadeAlunos[0] = 10; //o array, no caso, idadeAlunos, na posição 0 (primeira), recebe o valor de 10.
        idadeAlunos[1] = 11;
        idadeAlunos[2] = 13;
        idadeAlunos[3] = 12;
        idadeAlunos[4] = 11;
        int somaDasIdades = somaDosElementosDoArray(idadeAlunos);
        System.out.println (somaDasIdades);
        //passar um array como parametro é so passar o seu nome sem colchetes nem nada.
    }
}
