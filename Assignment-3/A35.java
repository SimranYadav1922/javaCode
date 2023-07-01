import java.util.Scanner;
class A35{
    public static void main(String[] args) {
        int s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of triangle:");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        if(s1==s2 && s2==s3 && s1==s3)
        System.out.println("Given triangle is an equilateral triangle");
        else if(s1==s2 || s2==s3 || s3==s1)
        System.out.println("Given triangle is an isosceles triangle");
        else 
        System.out.println("Given triangle is an scalene triangle");
    }
}