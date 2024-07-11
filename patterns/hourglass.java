public class hourglass {
    public static void main(String[] args) {


        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("o_");
                if (k == n) {
                    System.out.print("\b");
                }
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++){
                System.out.print("o_");
                if(k==n){
                    System.out.print("\b");
                }
            }
            System.out.println();
        }
    }
}