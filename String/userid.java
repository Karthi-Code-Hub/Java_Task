import java.util.*;
public class userid {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   String input1=sc.next();//Rajiv
   String input2=sc.next();//Roy
        int input3=sc.nextInt();//560037
        int input4=sc.nextInt();//6
        int len=input1.length();
        int len1=input2.length();
        List<Integer> arr=new ArrayList<>();
        List<Integer> arr1=new ArrayList<>();
        if(len>len1){
            while(input3!=0){
                int rem=input3%10;
                arr.add(rem);
                input3/=10;
            }
            int n=arr.get(input4-1);
            Collections.reverse(arr);
            List<Integer> arr3=new ArrayList<>(arr);
            String s1= input2.charAt(len1-1)+input1+arr3.get(input4-1)+""+""+n;

            StringBuilder res=new StringBuilder();
            for(char ch:s1.toCharArray()){
                if(Character.isUpperCase(ch)){
                    res.append(Character.toLowerCase(ch));
                }
                else if(Character.isLowerCase(ch)){
                    res.append(Character.toUpperCase(ch));
                }
                else{
                    res.append(ch);
                }
            }
            System.out.println(res.toString());
        }
        else{
            while(input3!=0){
                int rem=input3%10;
                arr.add(rem);
                input3/=10;
            }
            int n=arr.get(input4-1);
            Collections.reverse(arr);
            List<Integer> arr3=new ArrayList<>(arr);
            String s= input1.charAt(len-1)+input2+arr3.get(input4-1)+""+n+"";
            System.out.println(s);
           StringBuilder res=new StringBuilder();
           for(char ch:s.toCharArray()){
               if(Character.isUpperCase(ch)){
                   res.append(Character.toLowerCase(ch));
               }
               else if(Character.isLowerCase(ch)){
                   res.append(Character.toUpperCase(ch));
               }
               else{
                   res.append(ch);
               }
           }
            System.out.println(res.toString());

        }
    }
}