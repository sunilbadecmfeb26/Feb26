class StudentMarks {
    public static void main(String[] args) {

        int[][] marks = {
            {80, 70, 90},
            {60, 75, 85},
            {50, 65, 78}
        };

        System.out.println("Student\tSub1\tSub2\tSub3\tTotal\tAverage");

        for (int i = 0; i < marks.length; i++) {
            int total = 0;

            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }

            double avg = total / 3.0;

            System.out.println((i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                total + "\t" + avg);
        }
    }
}