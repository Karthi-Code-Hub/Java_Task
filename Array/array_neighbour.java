public class array_neighbour {
    public static void main(String[] args) {
        int arr[]={2,5,4,5,6,2,4};
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
