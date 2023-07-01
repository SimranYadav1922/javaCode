import java.util.Scanner;
class Assignment5{
    public static void main(String[] args) {
        int hindi,english,maths,science,Evs;
        float Percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of student");
        hindi=sc.nextInt();
        english=sc.nextInt();
        maths=sc.nextInt();
        science=sc.nextInt();
        Evs=sc.nextInt();

        Percentage= (hindi+english+maths+science+Evs)/5;
        System.out.println("Percentage of student=" +Percentage);

        String D=(Percentage>60)?"Pass with 1st division":(Percentage<60 && Percentage >45)?"Pass with 2nd division":(Percentage>30 && Percentage <45)?"Pass with 3rd division":" Fail";

        System.out.println("Student's status:" +D);
    }
}