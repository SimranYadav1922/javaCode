import java.util.Scanner;
class A20
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        short a,b,c;
        System.out.println("Enter the values of a and b");
        a=sc.nextShort();
        b=sc.nextShort();
        
         
        System.out.println("Before swapping="+a + "," +b);
        c=a;
        a=b;
        b=c;
       
        System.out.println("After swapping=" +a+ ","+b);
        }
}