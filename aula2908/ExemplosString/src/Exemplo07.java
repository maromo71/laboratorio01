public class Exemplo07 {
    public static void main(String[] args) {
        String texto = "O jogo precisa de bola. A bola esta " +
            " na quadra. Tem outra bola";
        int pi, pf;
        pi = texto.indexOf("bola");
        pf = texto.lastIndexOf("bola");
        System.out.println("Pos inicial: " + pi);
        System.out.println("Pos final: " + pf);
    }
}
