package gitTest;
//objetivo : fazer uma piramide centralizada

public class PiramidTest {
    public static void main(String[] args) {
        int height = 8; // altura que vai ser a imagem
        int start = 1;
        int size = 0;// tamanho de simbolos que vão ficar por fora
        //como sempre tem que dar um valor impar e maior que o valor da altura,
        // eu fiz esse if para sempre dar um valor impar e maior que height
        if (height % 2 == 0) {
            size = height * 3 + 1;
        } else {
            size = height * 3;
        }
        int StartTest = size; // depois que fizer a centralização, o valor tem que voltar para seu estado inicial, dessa forma ele podera ser usado novamente para centralizar


        for (int i = 1; i <= height; i++) {
            // achar a centralização tanto para o lado esquerdo quanto direito
            size = (size / 2) - (start / 2);
            System.out.println("-".repeat(size) + "*".repeat(start) + "-".repeat(size));
            // como é uma piramide, sempre sera igual o valor anterior +2;
            start += 2;
            //como dito antes, tem que voltar pro valor, senão o valor vai ficar sempre diminuido por está sendo /2 e subitraindo o valor do start
            size = StartTest;

        }

    }
}
