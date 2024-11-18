import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        System.out.println("hello");
        int arr [] = new int[5];
        Scanner sc = new Scanner(System.in);
        
       for(int i =0; i<3;i++){
        System.out.println("enter the values of input array");
         int element = sc.nextInt();
         arr[i] = element;
         }
        // int arr1[] =new int[5];
       
      //arru(arr);
      insert(arr, 1, 5);
    }

    public static void arru(int arr1[]){
        System.out.println("array function");
        for(int i =0 ;i<arr1.length;i++){
          System.out.println( "the value is " + arr1[i]);
        }
        
       }
       
      //  public static void insert (int array[], int position, int element){
        
      //    for (int i = array.length-1;i>=position;i--){
      //       array[i+1] = array[i];
      //    }
      //    array[position] = element;
      //  }
}


 