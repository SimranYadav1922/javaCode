import java.util.Scanner;
class A31{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a;
        char c,C,f,F;
        a=sc.nextFloat();
        System.out.println("Press c or C for fehrenheit to celsius and Press f or F for celcius to fehrenheit:");
        int temperature;
        temperature=sc.nextInt();
        switch(temperature){
            case 'c':
            a=(a-32)/1.8f;
            System.out.println("In celcius" +a);
            break;
            case 'C':
            a=(a-32)/1.8f;
            System.out.println("In celcius" +a);
            break;
            case 'f':
            a=(float)(a*1.8)+32f;
            System.out.println(" In Fahrenheit" +a);
            break;
            case 'F':
            a=(float)(a*1.8)+32;
            System.out.println("In Fahrenheit" +a);
            break;
        }

    }
}