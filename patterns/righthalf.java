public class righthalf {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
//                if(j==i){
                System.out.print("x_");
                if (j == i) {
                    System.out.print("\b");
//            }else{
//                    System.out.print("x_");
                }

            }
            System.out.println();
        }

    }
}

