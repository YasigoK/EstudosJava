package Aula_61_ate_100.A80_Strings.Testes;

//Treino seguindo Aula Aula 80-81 : String do Canal DevDojo :
//
public class stringTest {
    public static void main(String[] args) {
        String nome = "willian";
//        String sobrenome = new String("Susano");
        //outra forma de fazer :
        //nome.concat(" Perdeneiras"); // se fizer dessa forma ele concatena, mas não salva em nenhum lugar, só faz a ação mesmo
        nome = nome.concat(" Abreu");
        System.out.println(nome);

        //Aproveita que já existe na poolString o nome willian e reaproveita
        String nome2 = "willian";

        //a maior diferença daqui é que você cria uma objeto string(nem é muito recomendado)
        String nome3 = new String("Catarina");


        String test = "Jojo";
        String test2 = "JOJO";
        String test3 = "DangoBalango";
        String test4 = "        Espacamento entre as palavras       ";
        //imprime o char da posição
        //System.out.println(test.charAt(2));
        for (int i = 0; i < test.length(); i++) {
            System.out.println(test.charAt(i));
        }
        if (test.equalsIgnoreCase(test2)) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }

        //Troca de letras :
        System.out.println(test.replace('o', 'i'));

        System.out.println(test.toUpperCase());

        //Seleção de inicio/fim de um String
        System.out.println(test3.substring(5));
        System.out.println(test2.substring(2,4));

        //Remoção de espaços em branco(inicio e fim)
        System.out.println(test4.trim());

    }
}
