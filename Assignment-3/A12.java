import java.util.Scanner;
class A12{
    public static void main(String[] args) {
        int N,i,j,k,R,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4 digit number:");
        N=sc.nextInt();
        
        i=N/1000;
        j=(N/100)%10;
        k=(N/10)%10;
        l=N%10;
        R=l*1000+k*100+j*10+i*1;
        System.out.println("Reverse=" +R);
       
    }
}