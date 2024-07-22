import java.util.*;
public class First_Last_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
                ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            arr.add(s.charAt(i));
        }
        String s1=arr.get(0)+"."+arr.get(arr.size()-1);
        System.out.println(s1.toUpperCase());

//        Use of Split Method
//        String[] arr=s.split(" ");
//        String s1=arr[0].charAt(0)+"."+arr[1].charAt(arr[1].length()-1);
//        System.out.println(s1.toUpperCase());
        }

    }

