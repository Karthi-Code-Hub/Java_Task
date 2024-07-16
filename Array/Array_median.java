import java.util.*;
public class Array_median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();}
        int[] result = Arrays.stream(arr).filter(i -> !containsZero(i)).toArray();
        if(result.length%2!=0){
            System.out.println(result[result.length/2]);}
        else {
            int mid1 = result[result.length / 2 - 1];
            int mid2 = result[result.length / 2];
            System.out.println((mid1 + mid2) / 2.0);
        }}
    private static boolean containsZero(int value) {
        if (value == 0) return true;
        while (value != 0) {
            if (value % 10 == 0) return true;
            value /= 10;}
        return false;}}

