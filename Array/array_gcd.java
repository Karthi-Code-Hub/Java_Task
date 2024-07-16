import java.util.*;
public class array_gcd {
    public static void main(String[] args) {
        System.out.println(array_gcd.gcd(1,3));
        System.out.println(array_gcd.gcd(2,4));
        System.out.println(array_gcd.gcd(0,2));
    }
    static int  gcd(int a, int b) {
        int arr[] = {2,3,60,90,50};
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = a; i<=a; i++){
            for (int j = 1; j < 100; j++){
                if (arr[i] % j == 0 && arr[i + 1] % j == 0 && arr[b]%j == 0) {
                    n.add(j);
                }
            }
        }
        return n.get(n.size() - 1);
    }
}