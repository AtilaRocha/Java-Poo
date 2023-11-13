package src.FuncoesMetodos;

public class ExemploFuncaoMetodos {
    public static int soma(int num1, int num2) { //a e b são parametros passados na chamada da função.

        return num1 + num2; //return é um comando para voltar alguma variável (ou ate mesmo outra funcao) do mesmo tipo que a funcao foi criada.
    }

    public static void mostrar(int x) {
        //x é uma variável qualquer passada por parametro
        System.out.println(x); //mostra o conteudo que veio em x.
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c = soma(a, b); //chamando a funcao e atribuindo o que retorna dela na variável c. É passado por parâmetro os valores que você quer somar e a variável que vai receber deve ser do tipo de retorno da função.

        mostrar(c); //chamando uma função sem retorno que mostra a variável passada por paramêtro.
    }
}
