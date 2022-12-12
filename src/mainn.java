public class mainn {
    public static void main(String[] args) {
        ContactApp CA=new ContactApp();

        CA.Display();
        CA.Search(CA.contact, 308349635);
        CA.insert();
        //CA.Search("sumair",CA.names);

    }
}
