package Inheritance;

public class AdminClientTest {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Client client = new Client();

        admin.setName("Haroun");
        client.setName("Ahmad");

        System.out.println("this admin own method " + admin.adminMethod());
        System.out.println("this client own method " + client.clientMethod());

        System.out.println("this is the admin name " + admin.getName());
        System.out.println("this is the client name " + client.getName());
    }
}
