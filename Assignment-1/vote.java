import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        int age;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of person");
        age=sc.nextInt();

        String S=(age>18)?"Eligible":"Not Eligible";
        System.out.println(S);

       
    }
}