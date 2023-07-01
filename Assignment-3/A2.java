import java.util.Scanner;
class A2{
    public static void main(String[] args) {
        int cost;
        float Discount,Total_price;
        Scanner sc=new Scanner(System.in);
        System.out.println("Cost of purchased quantity:");
        cost=sc.nextInt();
        if(cost>1000){
            Discount=(cost*10)/100;
            Total_price=cost-Discount;
            System.out.println("cost after discount:"+Total_price);
        }
        else{
            Total_price=cost;
            System.out.println("Cost without discount:");
        }

    }
}