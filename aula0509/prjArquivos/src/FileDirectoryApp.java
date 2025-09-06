import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDirectoryApp {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String caminho = "C:\\santalucia\\laboratorio01\\aula0509\\prjArquivos";
        System.out.println("Digite o nome do arquivo desejado: ");
        String arquivo = input.nextLine();
        String nomeCompeto = caminho + "\\" + arquivo;
        Path path = Paths.get(nomeCompeto);
        if(Files.exists(path)){
            System.out.println("Arquivo encontrado");
            System.out.println("Ultima mod.: " + Files.getLastModifiedTime(path));
            System.out.println("Tam. do Arquivo: " + Files.size(path) + " bytes");
            System.out.println(Files.isDirectory(path));
            System.out.println("Arq: " + path.getFileName());
            System.out.println("Caminho: " + path.toAbsolutePath());
            //Leitura do texto dentro do arquivo
            //System.out.println(Files.readString(path));
            //Fechar o arquivo (falta)
            
            DirectoryStream<Path> pathStream = Files.newDirectoryStream(path);
            for(Path item : pathStream){
                System.out.println(item.getFileName());
            }

        }else{
            System.out.println("Arquivo nao encontrado");
        }
    
    }
}
