public class max {
    public static void main(String[] args) {
        int [] array={3,2,50,51,7};
        int m = 0;
        // 1 step.
        m=array[0];
        // 2 step loop third step repeat
        for (int i:array){
            if(i>m){
                m=i;
            }

        }System.out.println("the maximun number in array is "+m);

    }
}
