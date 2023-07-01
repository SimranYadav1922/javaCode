import java.util.Scanner;
class A21{
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1>n2)
        System.out.println("Number1 is greater");
        else
        System.out.println("Number2 is greater");
    }
}