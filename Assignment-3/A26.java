import java.util.Scanner;
class A26{
    public static void main(String[] args) {
        int N;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        N=sc.nextInt();

        switch(N%2){
        case 0:
        System.out.println(N+" is a Even number");
        break;
         case 1:
         System.out.println(N+" is a Odd number");
         break;
        }
    }
}