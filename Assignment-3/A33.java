import java.util.Scanner;
class A33{
    public static void main(String[] args) {
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        N=sc.nextInt();
        
        if((N/2)*2==N)
        System.out.println("Number is even");
        else 
        System.out.println("Number is odd");
    }
}