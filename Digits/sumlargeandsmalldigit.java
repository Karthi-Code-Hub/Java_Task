import java.util.*;

public class sumlargeandsmalldigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String s = n + "";
        String s1 = n1 + "";
        String s2 = n2 + "";
        int arr[] = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(s.charAt(i) + "");
        }
        int arr1[] = new int[4];
        for (int i = 0; i < 4; i++) {
            arr1[i] = Integer.parseInt(s1.charAt(i) + "");
        }
        int arr2[] = new int[4];
        for (int i = 0; i < 4; i++) {
            arr2[i] = Integer.parseInt(s2.charAt(i) + "");
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int a = (arr[0] + arr1[0] + arr2[0]) + (arr[3] + arr1[3] + arr2[3]);
        System.out.println(a);
    }
}
