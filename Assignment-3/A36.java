import java.util.Scanner;
class A36{
    public static void main(String[] args) {
        int A1,A2,A3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the angles of a triangles:");
        A1=sc.nextInt();
        A2=sc.nextInt();
        A3=sc.nextInt();
         if((A1+A2+A3)==180)
         System.out.println("Given Triangle is valid");
         else
         System.out.println("Given Triagle is not valid");
    }
}