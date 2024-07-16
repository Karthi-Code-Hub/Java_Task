public class small_element_array {
    public static void main(String[] args) {
        int arr[] = {10, 20, 3};
        int arr1[] = {1, 4, 5};
        int arr2[] = {5, 6, 7};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr1[i]&&arr[i]<arr2[i]){
                System.out.print(arr[i]+" ");
            }
            else if(arr1[i]<arr[i]&&arr1[i]<arr2[i]){
                System.out.print(arr1[i]+" ");
            }
            else{
                System.out.print(arr2[i]+" ");
            }
        }

    }       }

