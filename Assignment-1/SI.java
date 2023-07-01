import java.util.Scanner;
class Assignment7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p,r,t;
        float SI;
        System.out.println("Enter the values of p,r and t");
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        SI=(p*r*t)/100;
        System.out.println("Simple Interest=" +SI);
    }
}