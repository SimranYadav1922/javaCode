import java.util.Scanner;
class Assignment10{
    public static void main(String[] args) {
        int r,h;
        float  pi,Volume;
        pi=3.14f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height and radius of the cylinder");
        h=sc.nextInt();
        r=sc.nextInt();
        Volume=pi*r*r*h;
        System.out.println("Volume fo cylinder=" +Volume);
    }
}
