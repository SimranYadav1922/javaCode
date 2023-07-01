import java.util.Scanner;
class A32{
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        N=sc.nextInt();
        if(N>0)
        System.out.println("Number is positive");
        else 
        System.out.println("Number is negative");
    }
}