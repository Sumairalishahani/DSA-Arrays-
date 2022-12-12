import javax.swing.*;
import java.util.Objects;

public class ContactApp {

    int [] contact= {308349635,309349040,30083106};
    String[] names={"sumair1","sumair2","sumair3"};
    int i,j;



    public void Display(){
        System.out.println("----------------------");
        System.out.println("\t\t\t\tDISPLAYING CONTACT ");
        for (int i=0;i< names.length;i++){
            System.out.println(names[i]+": "+contact[i]);

        }
        //System.out.println(contact.toString());

    }
    public void Search(int[]Arr,int number){
        System.out.println("----------------------");
        System.out.println("\t\t\t\t SEARCHING CONTACT NAME: "+number);
        j=0;

        for(int i=0;i< Arr.length;i++){
            if(Arr[i] == number){
                i=j;
            }

        }
        System.out.println("contact name: "+names[j]);



    }public void Search(String n,String[] name){
        System.out.println("----------------------");
        System.out.println("\t\t\t\t SEARCHING CONTACT NUMBER: "+n);
        for(int i=0;i< name.length;i++){
            if(name[i].equals(n)  ){
                i=j;
            }

        }
        System.out.println("contact number: "+contact[j]);

    }
    public void insert(){
        System.out.println("----------------------");
        System.out.println("\t\t\t\t INSERTING CONTACT ");
        for (int i=contact.length-1;i>0;i--){
            contact[i]=contact[i-1];
        }




    }
    public void update(){

    }
    public void Delete(){

    }
}
