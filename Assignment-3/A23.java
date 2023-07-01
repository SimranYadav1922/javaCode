import java.util.Scanner;
class A23{
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        N=sc.nextInt();
        if(N%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}