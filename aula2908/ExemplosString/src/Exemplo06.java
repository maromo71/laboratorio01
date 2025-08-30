import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        String frase = "Socorram me perdi em Marrocos";
        frase = frase.toLowerCase();
        String palavra;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        palavra = leitor.nextLine().toLowerCase();
        if(frase.startsWith(palavra)){
            System.out.println("Inicio coincide");
        }else{
            System.out.println("Inicio não coincide");
        }
        if(frase.endsWith(palavra)){
            System.out.println("Fim coincide");
        }else{
            System.out.println("Fim não coincide");
        }
        if(frase.contains(palavra)){
            System.out.println("A frase contém a palavra");
        }else{
            System.out.println("A frase não contém a palavra");
        }
    }
}
