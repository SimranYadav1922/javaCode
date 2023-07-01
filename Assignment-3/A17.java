import java.util.Scanner;
class A17{
    public static void main(String[] args) {
        int length,breadth,Area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle:");
        length=sc.nextInt();
        breadth=sc.nextInt();
        Area=length*breadth;
        System.out.println("Area of ractangle:" +Area);

    }
}