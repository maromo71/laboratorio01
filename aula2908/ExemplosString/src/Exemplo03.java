public class Exemplo03 {
    public static void main(String[] args) {
        String texto = "O Brasil é o país do " +
         " futuro. Concorda ?";
        System.out.println("Tam: " + texto.length());
        char setimo = texto.charAt(6);
        System.out.println("Setimo: " + setimo);
        char[] pedaco = new char[9];
        texto.getChars(0, 8, pedaco, 0); 
        for(char l : pedaco){
            System.out.println("'" + l + "'");
        }
       
    }
}
