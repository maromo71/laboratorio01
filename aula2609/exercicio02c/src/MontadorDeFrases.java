public class MontadorDeFrases {
    public static void main(String[] args) {
        String[] palavras = {"este", "é", "um", "exercício", "com", "StringBuffer"};
        // Inicia a contagem do tempo
        long tempoInicial = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer();
        for (String palavra : palavras) {
            sb.append(palavra).append(" ");
        }

        // Remove o último espaço em branco
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        // Finaliza a contagem do tempo
        long tempoFinal = System.currentTimeMillis();
        double duracao = (tempoFinal - tempoInicial) / 1000;

        System.out.println("Frase montada: " + sb.toString());
        System.out.println("Tempo de execução (segundos): " + duracao);
    }
}