import java.util.Scanner;

public class leapyear {
    // Write a JAVA program to check whether a year is a leap year or not. 
    public static void main(String[] args) {
        
        Scanner year = new Scanner(System.in);

        System.out.println("Enter a year to check: ");

        int year1 = year.nextInt();
        
        if (year1>0){

            if(year1%100!=0){
                
                
                if(year1%4==0){
                    System.out.println(year1 + " is a Leap year");
            }
            else{
                System.out.println("not a leap year");
            }
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
