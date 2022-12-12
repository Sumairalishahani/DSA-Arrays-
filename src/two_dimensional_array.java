import java.util.Arrays;
import java.util.Scanner;
 class two_dimensional_array {
     public static void main(String[] args) {


     int temp=0,s;
    int [][]array=new int[3][10];
     int [] one_D=new int[30];
    Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("Enter values for row :"+(i+1));
            for(int j=0;j<10;j++){
                array[i][j]=sc.nextInt();
            }
            System.out.println(" ");
        }
        System.out.println("Array element is ");
        for (int []rows:array){
            System.out.println(Arrays.toString(rows));
        }


        for (int row=0;row<3;row++){
            for (int col=0;col<10;col++){
                s=array[row][col];
                one_D[temp]=s;
                temp++;
            }
        }
        System.out.println("After converting to one dimensional array:\n[");
        for (int i=0;i<one_D.length;i++){
            System.out.print(" "+one_D[i]+" ");
        }
        System.out.print("]");

         sorting(one_D);

         System.out.println("\n\nAfter sorting: ");
         for(int i =0;i<one_D.length;i++) {
             System.out.print(" "+one_D[i]+" ");
         }
         System.out.println("\n\n");
         System.out.println(binarySearch(one_D,15));


    }
    public static void sorting(int[]array){
        int x=array.length;
        for (int j=1;j<x;j++){
            int value=array[j];
            int i=j-1;
            while ( (i > -1) && ( array [i] > value ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = value;
        }




    }
    public static int  binarySearch(int [] a,int n){
         int p=0,q= a.length-1;
         int counter=0;
        while (p <= q) {
            counter++;
            int i=(p+q)/2;
            if(a[i]==n)
                return i;

            if(a[i]<n)
                p=i+1;
            else
                q=i-1;

        }



         return -1;

    }


}
