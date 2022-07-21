package ExerciciosMetodoJava;

public class ExerciciosMetodoJava {
    public static void main(String[] args) {

        //exercicio calculadora

        System.out.println("Exercicio Calcular");

        Calculadora.soma(9, 25);
        Calculadora.subtracao(965, 187);
        Calculadora.multiplicacao(8.8, 6.35);
        Calculadora.divisao(49, 50);

        System.out.println("Exercicio Mensagem");

        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(17);
        Mensagem.obterMensagem(22);

        System.out.println("Exercicio Emprestimo");

        Emprestimo.calcular(1545, 2);
        Emprestimo.calcular(1545, 3);
        Emprestimo.calcular(1545, 4);



    }

}
