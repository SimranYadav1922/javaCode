import java.util.Scanner;
class A24{
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        N=sc.nextInt();
        if(N>0)
        System.out.println("number is positive");
        else
        System.out.println("number is negative");
    }
}