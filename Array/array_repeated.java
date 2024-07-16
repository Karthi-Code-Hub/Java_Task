//import java.util.*;
//public class array_repeated {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[10];
//       Set<Integer> arr1=new TreeSet<>();
//        for (int i = 0; i < 10; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i=0; i<10; i++) {
//            for(int j=i+1;j<10;j++){
//                if(arr[i]==arr[j]){
//                    arr1.add(arr[i]);
//                    break;
//                }
//            }
//        }
//        for(int n:arr1){
//            System.out.println(n);
//    }
//}}
import java.util.*;
public class array_repeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<10; i++) {
            for(int j=i+1;j<10;j++){
                if(arr[i]==arr[j]&&!arr1.contains(arr[i])){
                    arr1.add(arr[i]);
                    break;
                }
            }
        }
        for(int n:arr1){
           System.out.println(n);
        }
    }}