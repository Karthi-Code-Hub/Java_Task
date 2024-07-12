public class Number_increase_Sequence{
    static void number(int n,int c) {
        for(int i=1;i<=n;i++){
            System.out.print(c+" ");
            c+=i;
        }
    }
    public static void main(String[] args) {
        int k=10;
        int c=1;
        number(k,c);
    }
}