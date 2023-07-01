import java.util.Scanner;
class Assignment9{
    public static void main(String[] args) {
        short a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        a=sc.nextShort();
        b=sc.nextShort();
        System.out.println("Before swapping=" +a+"'"+b);
        a=(short)(a+b);
        b=(short)(a-b);
        a=(short)(a-b);
        System.out.println("After swapping=" +a+","+b);
    }
}