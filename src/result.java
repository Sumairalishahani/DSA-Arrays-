public class result {
    public void setOOPmarks(float marks){
        float VMarks = 0;
        if(marks>=0 || marks<=100){
            System.out.println("marks:"+marks);
        }else
            VMarks=marks;
        System.out.println("marks is not valid "+VMarks);
    }


    public static void main(String[] args) {
        result r=new result();
        r.setOOPmarks(1000);

    }
}
