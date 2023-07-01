import java.util.Scanner;
class A11{
    public static void main(String[] args) {
        int age;
        char sex,marital_status,m,M,f,F,y,Y,n,N;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        age=sc.nextInt();
        
        System.out.println("Enter marital status:");
        marital_status=sc.next().charAt(0);
        System.out.println("Enter sex:");
        sex=sc.next().charAt(0);
        if(sex=='f'||sex=='F')
          System.out.println("She will work only in urban areas");

        else if((sex=='m' || sex=='M') && (age>20 && age<40))
            
        System.out.println("He can work anywhere");

         else if(age>40 && age<60)

         System.out.println("He will work in urban araes only");

         else  
            System.out.println("ERROR");
         

        
    }
}