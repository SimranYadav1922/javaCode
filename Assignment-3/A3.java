import java.util.Scanner;
class A3{
    public static void main(String[] args) {
        int bonusAmount,salary,serviceYear,Final_salary;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary:");
        salary=sc.nextInt();
        System.out.println("Enter your years of service:");
        serviceYear=sc.nextInt();
        if(serviceYear>5){
            bonusAmount=(salary*5)/100;
            Final_salary=bonusAmount+salary;
            System.out.println("Employee salary with 5% bonus:"+Final_salary);
        }
        else{
            Final_salary=salary;
            System.out.println("Employee salary without bonus:"+Final_salary);
        }
    }
}