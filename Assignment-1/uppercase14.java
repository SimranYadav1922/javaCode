import java.util.Scanner;
class Assignment14{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String lowStr;
      System.out.println("Enter lowercase string to convert:");
       lowStr=sc.nextLine();
      String lowStr2=lowStr.toUpperCase();
        System.out.println("The uppercase string  " +lowStr2);
    }
}