import java.util.Scanner;
class A16{
    public static void main(String[] args) {
        int r;
        float pi=3.24f,Area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        r=sc.nextInt();
        Area=pi*r*r;
        System.out.println("Area of Circle:" +Area);
    }
}