import java.sql.DriverManager;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            int valor = 10;
            int outroValor;
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um valor: ");
            outroValor = leitor.nextInt();
            int resultado = valor / outroValor;
            System.out.println("Resultado: " + resultado);
        }catch(InputMismatchException e){
            System.out.println("Entrada inválida! " +
                "Por favor, digite um número inteiro.");
        }catch(ArithmeticException e){
            System.out.println("Erro de divisão por zero! " +
                "Por favor, evite dividir por zero.");
        }catch(Exception e){
            System.out.println("Ocorreu um erro inesperado: " 
            + e.getMessage());
        }finally {
            System.out.println("Operação finalizada.");
        }
    }
}
