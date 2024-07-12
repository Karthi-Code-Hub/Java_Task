import java.util.*;
public class Alphabets_numbers_symbols{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("choice 1 for alphabets");
        System.out.println("choice 2 for numbers");
        System.out.println("choice 3 for special char");
        System.out.print("enter your choice:");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.print("enter the char:");
                char a = sc.next().charAt(0);
                if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
                    System.out.println("vowels");
                }
                else if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
                    System.out.println("vowels");
                }
                else{
                    System.out.println("consonant");
                }
                break;
            case 2:
                System.out.print("enter the no:");
                int b = sc.nextInt();
                if(b<0 && b>=10){
                    System.out.println("no b/w 0 and 10");
                }
                else{
                    System.out.println("invalid");
                }
                break;
            case 3:
                System.out.print("enter the chhar:");
                char c = sc.next().charAt(0);
                if(c == '!' || c  == '@' || c == '#' || c == '$' || c == '%' || c == '&' || c == '*' ){
                    System.out.println("special characters");
                }
                else{
                    System.out.println("invalid");
                }
        }
    }
}