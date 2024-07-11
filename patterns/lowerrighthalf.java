public class lowerrighthalf {
    public static void main(String[] args) {
        int n = 5;
//        for(int i=n;i>=0;i--){
//            for(int j=1;j<=i;j++){
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (j == 1) {
                    System.out.print("x");
                } else {
                    System.out.print("x_");
                }

            }
            System.out.println();
        }
    }
}