public class fulldiamond {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("x_");
                if (k == n) {
                    System.out.print("\b");
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("x_");
                if (k == n) {
                    System.out.print("\b");
                }
            }
            System.out.println();
        }
    }
}
