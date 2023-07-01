import java.util.Scanner;
class A1{
    public static void main(String[] args) {
        int length,breadth;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle:");
        length=sc.nextInt();
        breadth=sc.nextInt();
        if(length==breadth){
            System.out.println("Given rectangle if square");
        }
        else{
            System.out.println("Given rectangle if rectangle");
        }
    }
}