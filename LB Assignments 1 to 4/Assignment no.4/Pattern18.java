public class Pattern18 {
    
       public static void main(String[] args) {
        
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("");
                }
            }
            System.out.println(i);
        }
    }
}