import java.util.Scanner;
class A15{
    public static void main(String[] args) {
        int Cost;
        float Tax;
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Cost of Bike:");
        Cost=sc.nextInt();
        if(Cost>100000){
        Tax=(Cost*15)/100;
        System.out.println("Road tax for Bike:" +Tax);
        }
         else if(Cost>50000 && Cost<=100000){
         Tax=(Cost*10)/100;
         System.out.println("Road tax for Bike:" +Tax);
         }
          else{
          Tax=(Cost*5)/100;
          System.out.println("Road tax forBike:" +Tax);
         }
        }
    }    
        
    
 
