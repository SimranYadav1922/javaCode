import java.util.Scanner;
class A14{
    public static void main(String[] args) {
        float Percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the percentage:");
        Percentage=sc.nextFloat();

        if(Percentage>90)
                System.out.println("Grade-A");
            
             else if(Percentage>80 && Percentage<=90)
                System.out.println("Grade-B");
             
              else if(Percentage>=60 && Percentage<=80)
                System.out.println("Grade-C");
            
                else
                    System.out.println("Grade-D");
    }
}