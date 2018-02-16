package br.com.mio.di.bao.arrays;

public class LeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
      int[] newArray = new int[n];
      for(int i = k, j=0; i < n; i++,j++){
          newArray[j] = a[i];
      }
      
      for(int i = n-k, j=0; i < n; i++,j++){
          newArray[i] = a[j];
      }
      return newArray;
    }
    
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int n = 5;//in.nextInt();
        int k = 4;//in.nextInt();
        int a[] = {1,2,3,4,5};// new int[n];
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}