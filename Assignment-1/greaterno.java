import java.util.Scanner;
class Assignment16{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,D;
          String C;      
        System.out.println("Enter the values of n1 and n2");
        n1=sc.nextInt();
        n2=sc.nextInt();

        C=(n1==n2)?"Equal":"Not Equal";
        System.out.println(C);

        D=(n1>n2)?n1:n2;
         System.out.println(D);
       
        


    }
}