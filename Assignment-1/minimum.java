import java.util.Scanner;
class Assignment2{
    public static void main(String[] args) {
        int n1,n2,n3,N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();

        N=(n1<n2)?n1:n2;
        N=(n2<n3)?n2:n3;
        N=(n3<n1)?n3:n1;
        System.out.println("Smallest between three distinct numbers:" +N);
    }
}