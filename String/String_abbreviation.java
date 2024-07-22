import java.util.*;
public class String_abbreviation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();//javaprogramming
        int len=s.length();
        String s1=s.charAt(0)+"";
        String s2=s.charAt(len-1)+"";
        int count=0;
        if(len>10){
            for(int i=1;i<len-1;i++){
                count+=1;
            }
            System.out.println(s1+""+count+""+s2);//j13g
        }
        else{
            System.out.println(s);
        }
    }
}
