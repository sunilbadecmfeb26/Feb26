public class LargestNumber {
    public static void main(String[] args) {
        
        int a = 58;
        int b = 47;
        int c = 67;

        if (a >= b && b >= c){
            System.out.println("Largest number is = " + a);
        }
        else if (b >= a && b >= c){
            System.out.println("Largest number is = " + b);
        }
        else{
            System.out.println("Largest number is = " + c);
        }        
    }
}
