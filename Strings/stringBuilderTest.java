package Aula_61_ate_100.A80_Strings.Testes;

//Treino seguindo Aula Aula 83 : String do Canal DevDojo :
//https://www.youtube.com/watch?v=QY92U86m77
public class stringBuilderTest {
    public static void main(String[] args) {
        //string builder meio que não é uma string
        String f = "Dia da semana";
        StringBuilder sb = new StringBuilder(10);//esse valor int é a capacidade do Builder

        sb.append("Alguma coisa");
        //usando append vc aproveita o objeto, otimizando a memória
        sb.append(" ou nenhuma coisa");
        System.out.println(sb);
    }
}
