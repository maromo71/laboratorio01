public class Exemplo05 {
    public static void main(String[] args) {
        String msg1 = "brasil ficou em ultimo".toLowerCase();
        String msg2 = "Brasil voltou a vencer".toLowerCase();
        boolean res;
        res = msg1.regionMatches(0, msg2, 0, 6);
        if(res){
            System.out.println("Sao coincidentes");
        }else{
            System.out.println("Nao sao coincidentes");
        }
    }
}
