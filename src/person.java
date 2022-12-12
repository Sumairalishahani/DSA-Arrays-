import java.util.Arrays;

class person {
    public person(){
        System.out.println(" we can not pass object of parent class to Array of sub class ");
    }

}class Student extends person{
    public  Student(){
        System.out.println("we can pass objects of child class to Array of parent class ");
    }
}
 class Main{
     public static void main(String[] args) {
         person p1=new person();
         person p2=new person();
         person p3=new person();

         Student s1=new Student();
         Student s2=new Student();
         Student s3=new Student();
         person[] array={s1,s2,s3};


       //  Student[] arrayy={p1,p2,p3};// we can not pass object of parent class to Array of sub classn


     }
 }
