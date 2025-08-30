import java.util.Arrays;
import java.util.List;

public class Exemplo08 {
    public static void main(String[] args) {
        String n1 = "Antonio Souza";
        String n2 = "Maria Catarina Silva";
        String n3 = "Pedro R Barbosa";
        List<String> nomes = Arrays.asList(n1, n2, n3);
        //Passar pela lista, imprimindo os sobrenomes
        for(String nome : nomes){
            System.out.println(nome.substring(nome.lastIndexOf(" ")+1));
        }
    }
}
