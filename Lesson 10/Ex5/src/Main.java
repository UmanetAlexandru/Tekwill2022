public class Main {

    public static void main(String[] args) {
        User u1 = new User();
        u1.setFirstName("Alex");
        u1.setLastName("Macedon");

        User u2 = new User();
        u2.setFirstName("Maria");
        u2.setLastName(null);


        User u3 = new User();
        u3.setFirstName(null);
        u3.setLastName("Smith");

        User u4 = new User();
        u4.setFirstName(null);
        u4.setLastName(null);

        System.out.println(u1.getFullName());
        System.out.println(u2.getFullName());
        System.out.println(u3.getFullName());
        System.out.println(u4.getFullName());

    }
}
