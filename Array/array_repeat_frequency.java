import java.util.*;
public class array_repeat_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        ArrayList<Integer>arr1=new ArrayList<>();
       for(int i=0;i<10;i++){
           arr[i]=sc.nextInt();
       }
        for (int i = 0; i < 10; i++){
            for(int j=i+1;j<10;j++){
                if(arr[i]==arr[j]){
                    arr1.add(arr[i]);
            }
        }
    }}}

