import java.util.Scanner;
class A18{
    public static void main(String[] args) {
        
            int hindi,english,maths,science,Evs;
            double Percentage;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the marks of student:");
            hindi=sc.nextInt();
            english=sc.nextInt();
            maths=sc.nextInt();
            science=sc.nextInt();
            Evs=sc.nextInt();
            Percentage=(hindi+english+maths+science+Evs)/5;
            System.out.println("Percentage of student:"+Percentage);
    }
}