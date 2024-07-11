public class hollowsquare {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n)
                    System.out.print("x");
                else if(j>1&&j<n){
                    System.out.print("-");
                }
                else{
                    System.out.print("x");
                }
            }
            System.out.println();
        }

    }
}
