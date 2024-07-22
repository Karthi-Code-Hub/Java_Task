import java.util.*;
public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.equals("rock")){
            System.out.println("paper");
        }
        else if(s.equals("scissors")){
            System.out.println("rock");
        }
        else{
            System.out.println("scissors");
        }
    }
}


