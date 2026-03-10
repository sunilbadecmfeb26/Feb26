class EvenNumbers {

    public static void main(String[] args){

        int i = 1;

        System.out.println("Even Numbers : ");
        
        while (i <= 50) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

            i++;
        }
    }
}