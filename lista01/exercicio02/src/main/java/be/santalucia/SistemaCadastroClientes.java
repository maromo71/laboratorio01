package be.santalucia;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class SistemaCadastroClientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            if (nome.isEmpty()) {
                System.out.println("Nome não pode ser vazio!");
                continue;
            };           

            System.out.println("Digite o email do cliente: ");
            String email = scanner.nextLine();
            if (!validarEmail(email)){
                System.out.println("Email inválido!");
                continue;
            } 

            System.out.println("Digite o telefone do cliente: ");
            String telefone = scanner.nextLine();
            if (telefone.isEmpty()) {
                System.out.println("Telefone não pode ser vazio!");
                continue;
            }

            String nomeFormatado = formatarNome(nome);
            Cliente cliente = new Cliente(nomeFormatado, email, telefone);
            if(persistirCliente(cliente)){
                System.out.println("Cliente cadastrado com sucesso!");
            }else{
                System.out.println("Erro ao cadastrar cliente!");
            }
            System.out.println("Deseja cadastrar outro cliente? (s/n)");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) break;

        }
        scanner.close();
        System.out.println("Encerrando o programa....");
    }

    public static boolean persistirCliente(Cliente cliente) {
        Path arquivo = Path.of("clientes.txt");
        String registro = cliente.getNome() +
                "," + cliente.getEmail() + 
                "," + cliente.getTelefone() +
                "\n";
        try {
            Files.write(arquivo, registro.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao persistir cliente: " + e.getMessage());
            return false;
        }
    }

    public static boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static String formatarNome(String nome) {
        String[] partes = nome.split(" ");
        StringBuilder nomeFomatado = new StringBuilder();
        for (String parte : partes) {
            nomeFomatado.append(Character.toUpperCase(parte.charAt(0)))
                    .append(parte.substring(1))
                    .append(" ");
        }
        return nomeFomatado.toString().trim();
    }
}