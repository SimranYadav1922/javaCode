import java.util.Scanner;
class A29{
    public static void main(String[] args) {
        int n1,n2,n3,n4;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any four number:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();
        if(n1<n2 && n1<n3 && n1<n4)
        System.out.println("n1 is lowest");

        else if(n2<n1 && n2<n3 && n2<n4)
        System.out.println("n2 is lowest");

        else if(n3<n1 && n3<n2 && n3<n4)
        System.out.println("n3 is lowest");

        else if(n4<n1 && n4<n2 && n4<n3)
        System.out.println("n4 is lowest");
    }
}