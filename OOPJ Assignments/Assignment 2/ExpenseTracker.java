public class ExpenseTracker {
    public static void main(String[] args) {

        int[] exp = {200, 500, 300, 700, 100, 900, 400};

        int sum = 0, max = exp[0], min = exp[0], dayMax = 0;

        for (int i = 0; i < 7; i++) {
            sum += exp[i];

            if (exp[i] > max) {
                max = exp[i];
                dayMax = i;
            }

            if (exp[i] < min) min = exp[i];
        }

        System.out.println("Total: " + sum);
        System.out.println("Average: " + (sum / 7));
        System.out.println("Max: " + max + " Day: " + (dayMax + 1));
        System.out.println("Min: " + min);
    }
}