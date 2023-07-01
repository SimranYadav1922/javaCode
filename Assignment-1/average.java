import java.util.Scanner;
class Assignment6{
    public static void main(String[] args) {
        int n1,n2,n3,n4,n5;
        float Average;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of n1,n2,n3,n4,n5");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();
        n5=sc.nextInt();
        Average=(n1+n2+n3+n4+n5)/5;
        System.out.println("Average of five numbers="+Average);
    }
}