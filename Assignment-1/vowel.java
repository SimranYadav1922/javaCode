import java.util.Scanner;
class Assignment19{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // char ch,e,i,o,u,A,E,I,O,U;
         System.out.println("Enter a character");

         char ch=sc.nextLine().charAt(0);
        //   char ch=sc.nextChar();
         String S=((ch == 'a') || (ch == 'A') || (ch=='e') || (ch=='E') || (ch=='i') || (ch=='I') || (ch=='o') || (ch=='O') || (ch=='u') || (ch=='U')) ? "Vowel" : "Consonant";
 
        //  vowel=ch,e,i,o,u;
        //  V=(vowel==char)?"Vowel":"consonant";
        //  System.out.println(V);
       System.out.println("The given character is:" +S);
    }
}