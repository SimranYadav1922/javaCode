import java.util.Scanner;
class Assignment18{
    public static void main(String[] args) {
        int days;
        int month,weeks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days");
       
        days=sc.nextInt();
        month=days/30;
        
        System.out.println("Days into month=" + month + " month  " + days%30 + " days ");
        // days=days%30;
        // System.out.println("days=" +days);
        weeks=days/7;
        System.out.println("Days to weeks=" + weeks + " weeks  " + weeks%7 + " days ");
       
    }
}