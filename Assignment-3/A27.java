import java.util.Scanner;
class A27{
    public static void main(String[] args) {
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any alphabet:");
        c=sc.next().charAt(0);
        switch(c){
            case 'a':
            System.out.println(c+ " is a vowel");
            break;

            case 'A':
            System.out.println(c+ " is a vowel");
            break;
            case 'e':
            System.out.println(c+ " is a vowel");
            break;
            case 'E':
            System.out.println(c+ " is a vowel");
            break;
            case 'i':
            System.out.println(c+ " is a vowel");
            break;
            case 'I':
            System.out.println(c+ " is a vowel");
            break;
            case 'o':
            System.out.println(c+ " is a vowel");
            break;
            case 'O':
            System.out.println(c+ " is a vowel");
            break;
            case 'u':
            System.out.println(c+ " is a vowel");
            break;
            case 'U':
            System.out.println(c+ " is a vowel");
            break;
            default:
            System.out.println(c+ "is a consonant");
            
        }
    }
}