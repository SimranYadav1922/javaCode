import java.util.Scanner;
class Assignment4{
    public static void main(String arg[]){

        int temperature;
        float C;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature");
        temperature=sc.nextInt();

        C=(float)(temperature=32)*5/9;
        System.out.println("Temperature in celsius=" +C+"C");
         

    }
}