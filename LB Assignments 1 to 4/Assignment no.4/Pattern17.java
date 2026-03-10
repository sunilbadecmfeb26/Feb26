public class Pattern17 {
    
    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 1; i <= n; i++) {

            int odd = 2 * i - 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(odd);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}



