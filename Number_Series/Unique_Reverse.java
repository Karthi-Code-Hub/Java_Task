class main{
    static void number(int n) {
        for(int i=10;i>=1;i--){
            System.out.print(i+" ");
            for(int j=1;j<=10;j++){
                if(j==n){
                    System.out.print(j+" ");
                }}
            n++;
        }}
    public static void main(String[] args) {
        int n=1;
        number(n);
    }}