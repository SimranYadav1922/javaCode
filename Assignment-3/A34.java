import java.util.Scanner;
class A34{
    public static void main(String[] args) {
        char c,a=65,A=65,z=91,Z=91;
        Scanner sc=new Scanner(System.in);
        

        System.out.println("Enter any character:");
        c=sc.next().charAt(0);
        
        if(a<=z && A<=Z)
        System.out.println("Character is alphabet");
        else
        System.out.println("Character is not a alphabet");
    }
}