import java.util.Scanner;
class A28{
    public static void main(String[] args) {
        int a,b;
        int operator;
        float Addition,result,Multiplication,Division;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1 and n2:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("1:Addition \n2:result \n3:Multiplication \n4:Division");
        System.out.println("Choose operator:");
        operator=sc.nextInt();
        result=0;
        switch(operator){
            case 1:
            result=a+b;
            System.out.println("Addtion:" +result);
            break;
            case 2:
            result=a-b;
            System.out.println("Substraction:" +result);
            break;
            case 3:
            result=a*b;
            System.out.println("Multiplication:" +result);
            break;
            case 4:
            result=a/b;
            System.out.println("Division:" +result);
            break;
        }
    }
}