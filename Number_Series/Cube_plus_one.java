public class Cube_plus_one {
        static void number(int n) {
            for(int i=1;i<=n;i++){
                int j =i*i*i+1;
                System.out.print(j+" ");
            }
        }

        public static void main(String[] args) {
            int n=5;
            number(n);
        }
    }
