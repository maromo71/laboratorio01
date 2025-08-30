import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um email: ");
        String email = sc.nextLine();
        if(email.contains("@") && 
        (email.endsWith(".com")|| email.endsWith(".com.br"))){
            System.out.println("Email valido");
        }else{
            System.out.println("Email invalido");
        }

    }
}
