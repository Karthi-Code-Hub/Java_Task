import java.util.*;
public class largestdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        String s=n+"";
        String s1=n1+"";
        String s2=n2+"";
        int arr[]=new int[4];
        int arr1[]=new int[4];
        int arr2[]= new int[4];
        for(int i=0;i<4;i++){
         arr[i]= Integer.parseInt(s.charAt(i)+"");
        }
        for(int i=0;i<4;i++){
            arr1[i]= Integer.parseInt(s1.charAt(i)+"");
        }
        for(int i=0;i<4;i++){
            arr2[i]= Integer.parseInt(s2.charAt(i)+"");
        }
        for(int i=0;i<4;i++){
            if((arr[i]>arr1[i]&&arr[i]>arr2[i])){
                System.out.print(arr[i]);
            }
            else if(arr1[i]>arr[i]&&arr1[i]>arr2[i]){
                System.out.print(arr1[i]);
            }
            else{
                System.out.print(arr2[i]);
            }
        }
    }
}
