public class Swap {

    public static void main(String[] args) {

        int [] sohail={1,3,4,5,6};
//        System.out.println("array before swap");
//        for (int i:sohail){
//            System.out.println(i);
//        }
        int temp=sohail[2];
        sohail[2]=sohail[3];
        sohail[3]=temp;
        System.out.println("After swap ");
        for (int i :sohail){
            System.out.println(i);
        }




//        String[] arr = {"First", "Second", "Third", "Fourth"};
//
//        System.out.println("Array before Swap" + "\n");
//        for (String element : arr) {
//            System.out.println(element);
//            //Simple Swapping logic
//
//
//        }
//
//
//        System.out.println("\n" + "Array after Swap" + "\n");
//        for (String element : arr) {
//            System.out.println(element);
//        }
    }
}