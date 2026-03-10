public class Patterncode15 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= 2 * n - 1; i++) {

            int num;

            if (i <= n) {
                num = i;
            } else {
                num = 2 * n - i + 1;
            }

            for (int j = 1; j <= num; j++) {
                System.out.print(num);
                if (j < num) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

