import java.util.*;
public class sumofallsmalllargedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String s = n + "";
        int arr[] = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(s.charAt(i) + "");
        }
        String s1 = n1 + "";
        int arr1[] = new int[4];
        for (int j = 0; j < 4; j++) {
            arr1[j] = Integer.parseInt(s1.charAt(j) + "");
        }
        String s2 = n2 + "";
        int arr2[] = new int[4];
        for (int k = 0; k < 4; k++) {
            arr2[k] = Integer.parseInt(s2.charAt(k) + "");
        }
        Arrays.sort(arr2);
       int sum=(arr[1]*arr1[2])*arr2[3];
        System.out.println(sum);
    }
}