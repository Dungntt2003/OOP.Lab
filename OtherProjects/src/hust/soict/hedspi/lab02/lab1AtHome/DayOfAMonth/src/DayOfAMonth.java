import java.util.Arrays;
import java.util.Scanner;

public class DayOfAMonth {
    static String[] January = {"January", "Jan.", "Jan", "1"};
    static String[] February = {"February", "Feb.", "Feb", "2"};
    static String[] March = {"March", "Mar.", "Mar", "3"};
    static String[] April = {"April", "Apr.", "Apr", "4"};
    static String[] May = {"May", "May.", "5"};
    static String[] June = {"June", "Jun.", "Jun", "6"};
    static String[] July = {"July", "Jul.", "Jul", "7"};
    static String[] August = {"August", "Aug.", "Aug", "8"};
    static String[] September = {"September", "Sep.", "Sep", "9"};
    static String[] October = {"October", "Oct.", "Oct", "10"};
    static String[] November = {"November", "Nov.", "Nov", "11"};
    static String[] December = {"December", "Dec.", "Dec", "12"};

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String month;
        int year;
        do {
            System.out.println("Input month : ");
            month = scanner.nextLine();      
        }
        while (!checkMonth(month));
        do {
            System.out.println("Input year : ");
            year = scanner.nextInt();
        }
        while (!checkYear(year));
        if (Arrays.asList(January).contains(month) || Arrays.asList(March).contains(month) || 
            Arrays.asList(May).contains(month) || Arrays.asList(July).contains(month) || 
            Arrays.asList(August).contains(month) || 
            Arrays.asList(October).contains(month) ||Arrays.asList(December).contains(month)){
                System.out.println(month + "/" + year + " has 31 days");
            }
        else if (Arrays.asList(April).contains(month) || Arrays.asList(June).contains(month) || 
                 Arrays.asList(September).contains(month) || Arrays.asList(November).contains(month)){
                    System.out.println( month + "/" + year + " has 30 days");                   
                 }
        else {
            if (year % 4 == 0 || (year % 4 == 0 && year % 100 != 0)){
                System.out.println(month + "/" + year + " has 29 days");                     
            }
            else System.out.println(month + "/" + year + " has 28 days");                     

        }
        scanner.close();

    }
     
    public static boolean checkMonth(String month){
    if (Arrays.asList(January).contains(month) || Arrays.asList(February).contains(month) || 
        Arrays.asList(April).contains(month) || Arrays.asList(March).contains(month) || 
        Arrays.asList(May).contains(month) || Arrays.asList(June).contains(month) || 
        Arrays.asList(July).contains(month) || Arrays.asList(August).contains(month) || 
        Arrays.asList(September).contains(month) || Arrays.asList(October).contains(month) ||
        Arrays.asList(November).contains(month) || Arrays.asList(December).contains(month)){
        return true;
        }
        return false;
    }
    
    public static boolean checkYear(int year){
        String Year = Integer.toString(year);
        if (Year.length() != 4)
        return false;
        return true;
    }
}
