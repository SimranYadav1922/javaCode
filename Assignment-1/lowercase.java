import java.util.Scanner;
class Assignment13{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String uppStr;
      System.out.println("Enter uppercase string to convert:");
       uppStr=sc.nextLine();
      String uppStr2=uppStr.toLowerCase();
        System.out.println("The lowercase string:" +uppStr2);
    }
}