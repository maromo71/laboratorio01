public class Exemplo09 {
    public static void main(String[] args) {
        String frase = "a vida continua boa de verdade";
        String resultado = frase.replace(" ", "|");
        System.out.println(resultado);
        String[] palavras = frase.split(" ");
        System.out.println("Total de Palavras: " + palavras.length);
        System.out.println("Palavras no vetor");
        for(String palavra : palavras){
            System.out.println(palavra);
        }
    }
}
