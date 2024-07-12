public class Two_Power{
  static void number(int j, int r) {
      System.out.print(j+" ");
      for (int i = 1; i <= r; i++) {
          j = j + j;
          System.out.print(j+" ");
      }}
    public static void main(String[] args) {
        int r=1;
        int k=6;
        number(r,k);
  }}