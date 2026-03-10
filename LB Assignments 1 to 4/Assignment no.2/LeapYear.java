public class LeapYear {

    public static void main(String[] args) {
        
        int year1 = 2016;
        int year2 = 2007;
        int year3 = 1992;

        checkleapyear(year1);
        checkleapyear(year2);
        checkleapyear(year3);
    }
        public static void checkleapyear(int year){

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }    
    
        // if (year % 4 == 0){
        //     System.out.println(year + " is a leap year.");
        // }
        // else if(year % 400 == 0 ){
        //     System.out.println(year + " is a leap year.");
        // }
        // else if(year % 100 != 0){
        //     System.out.println(year + " is not a leap year.");
        // }
        // else{
        //     System.out.println(year + " is not a leap year.");
        // }
    }
}