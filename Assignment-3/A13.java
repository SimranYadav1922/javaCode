import java.util.Scanner;
class A13{
    public static void main(String[] args) {
        
        int Weekday;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of weekday:");
        Weekday=sc.nextInt();
        if(Weekday==1)
        System.out.println("Day:Monday");
        else if(Weekday==2)
        System.out.println("Day: Tuesday");
        else if(Weekday==3)
        System.out.println("Day: Wednesday");
        else if(Weekday==4)
        System.out.println("Day: Thursday");
        else if(Weekday==5)
        System.out.println("Day: Friday");
        else if(Weekday==6)
        System.out.println("Day: Saturday");
        else 
        System.out.println("Day: Sunday");
        

    }
}