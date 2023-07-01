import java.util.Scanner;
class Assignment15{
    public static void main(String[] args) {
        char c;
        String s;
       

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character");
        c=sc.nextLine().charAt(0);

       s=((c>=65) && (c<=90))?"Upper Case":"Not in Upper Case";
       System.out.println("Entered character is:" +s);
    }
}