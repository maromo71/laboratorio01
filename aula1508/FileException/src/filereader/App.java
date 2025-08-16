package filereader;


import java.io.IOException;
import java.io.File;
import java.io.FileReader;

public class App {
    public static void main(String[] args)  {
        String nomeArquivoInexistente = "arquivo_que_nao_existe.txt";
        //pessoal, altere esse caminho para um arquivo que exista no seu computador
        //no windows use duplas barras \\ (algo parecido com o abaixo   )
        //assim: C:\\Users\\SeuUsuario\\Documents\\meu_arquivo.txt
        String nomeArquivoExistente = "/Users/marcosmoraes/santalucia/laboratorio01/meu_arquito.txt";
        // Para testar, crie um arquivo chamado meu_arquivo.txt na raiz do seu projeto
        // com algum conteúdo dentro.
        System.out.println("--- Tentando ler arquivo existente ---");
        try {
            // O chamador precisa TRATAR a IOException
            LerArquivo.lerArquivo(nomeArquivoExistente);
        } catch (IOException e) {
            System.err.println("\nErro ao ler o arquivo " + nomeArquivoExistente + ": " + e.getMessage());
        }
        System.out.println("\n--- Tentando ler arquivo inexistente ---");
        try {
            // O chamador precisa TRATAR a IOException
            LerArquivo.lerArquivo(nomeArquivoInexistente);
        } catch (IOException e) {
            System.err.println("\nErro ao ler o arquivo " + nomeArquivoInexistente + ": " + e.getMessage());
            System.err.println("Verifique se o arquivo existe e o caminho está correto.");
        }
    }
}
