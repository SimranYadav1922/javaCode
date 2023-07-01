import java.util.Scanner;
class Assignment11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p,r,n;
        double A,CI;
        System.out.println("Enter the principle, rate and time");
        p=sc.nextInt();
        r=sc.nextInt();
        n=sc.nextInt();

        A=p*(1+r/100);
        A=Math.pow((1+r/100),n);
        CI=A*p;
        System.out.println("Compound Interest=" +CI);
    }
}