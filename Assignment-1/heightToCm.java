import java.util.Scanner;
class Assignment17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n,p;
        System.out.println("Enter the height of person");
        n=sc.nextFloat();
         
        p=n*2.54f;
        System.out.print("inches \nHeight of a person into centimeters=" +p+"cm");


    }


}