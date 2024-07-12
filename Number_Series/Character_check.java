import java.util.*;
public class Character_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        char s = sc.next().charAt(0);
        if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
            System.out.println("vowels");
        }
        else if (s == '0' || s == '1' || s == '2') {
            System.out.println("Numbers");
        }
        else if (s != 'a' || s != 'e' || s !='i' || s != 'o' || s != 'u') {
            System.out.println("consonants");
        }else {
            System.out.println("Symbols");
        }
    }
}