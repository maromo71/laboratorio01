package filereader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
        public static void lerArquivo(String caminhoArquivo) throws IOException {
            FileReader reader = null;
            try {
                File arquivo = new File(caminhoArquivo);
                reader = new FileReader(arquivo);
                int caractere;
                while ((caractere = reader.read()) != -1) {
                    System.out.print((char) caractere);
                }
            } finally {
                // Garante que o reader seja fechado, mesmo que uma exceção ocorra
                if (reader != null) {
                    reader.close();
                    System.out.println("\nArquivo fechado no finally.");
                }
            }   
        }
}
