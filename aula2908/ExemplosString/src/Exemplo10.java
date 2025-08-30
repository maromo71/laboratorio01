import java.util.Scanner;

public class Exemplo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();
        System.out.println("Digite cinco palavras: ");
        for(int i=0; i<5; i++){
            System.out.println("Digite a palavra: ");
            buffer.append(sc.nextLine());
            buffer.append("\n");
        }
        String resultado = buffer.toString();
        System.out.println(resultado);
        System.out.println("Palavra a retirar: ");
        String palavraRetirar = sc.nextLine();
        int pInicial = buffer.indexOf(palavraRetirar);
        int pFinal = pInicial + palavraRetirar.length() + 1;
        buffer.delete(pInicial, pFinal);
        System.out.println("==============");
        System.out.println(buffer.toString());
    }
}
