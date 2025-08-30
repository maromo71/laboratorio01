public class Exemplo01 {
    public static void main(String[] args) throws Exception {
        char l1 = 'A';
        char l2 = 'B';

        System.out.printf("%d\n", (int)l1);
        System.out.printf("%d\n", (int)l2);
        if(l1 < l2){
            System.out.println("Vem antes");
        }else{
            System.out.println("Vem depois");
        }
        for(int i=0; i<128; i++){
            System.out.printf("%d = %c\n", i, (char)i);
        }

    }
}
