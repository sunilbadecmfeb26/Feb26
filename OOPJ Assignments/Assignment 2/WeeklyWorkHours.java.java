class WeeklyWorkHours {
    public static void main(String[] args) {

        int[][] empHours = {
            {8, 8, 7, 8, 6},
            {9, 8, 8},
            {7, 7, 7, 7, 6, 5}
        };

        for (int i = 0; i < empHours.length; i++) {
            System.out.print("Employee " + (i + 1) + ": ");

            for (int j = 0; j < empHours[i].length; j++) {
                System.out.print(empHours[i][j] + " ");
            }

            System.out.println();
        }
    }
}