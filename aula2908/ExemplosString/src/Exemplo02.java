public class Exemplo02 {
    public static void main(String[] args) {
        char vogais[] = {'a', 'e', 'i', 'o', 'u'};
        for (char c : vogais) {
            System.out.println(c);
        }
        String sVogais = new String(vogais);
        System.out.println(sVogais);
        String nome = "Antonio";
        System.out.println("Tamanho: ");
        System.out.println(nome.length());
        //percorrer toda a string, mostrando
        //caractere a carectere
        for(int i=0; i<nome.length(); i++){
            System.out.println(nome.charAt(i));    
        }
    }
}
