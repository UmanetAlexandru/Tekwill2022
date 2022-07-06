public class Main {

    public static void main(String[] args) {
        Clock c = new Clock();//12:00
        c.display();
        c.next();//12:01
        c.display();
        System.out.println();
        Clock c2 = new Clock(11, 59);//11:59
        c2.display();
        c2.next();//12:01
        c2.display();
    }
}
