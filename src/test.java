class Target_value {

    public  int linearSearch(int[] arr, int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == value){
                return i;


            }

        }
        return -1;

    }
}
public class test{
    public static void main(String[] args){
        Target_value tv=new Target_value();
        int[] array= {1,2,3,5,7,9};
        int Target_value = 5;

        System.out.println(Target_value+" is found at index: "+tv.linearSearch(array,Target_value));
    }

}