import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    String[] arr = s.split("; ");

    switch (arr[0]) {
      case "Publication" :
        Publication publication = new Publication(arr[1]);
        System.out.println(publication.getInfo());
        break;
      case "Newspaper" :
        Newspaper np = new Newspaper(arr[1], arr[2]);
        System.out.println(np.getInfo());
        break;
      case "Article" :
        Article art = new Article(arr[1], arr[2]);
        System.out.println(art.getInfo());
        break;
      case "Announcement" :
        Announcement ann = new Announcement(arr[1], Integer.parseInt(arr[2]));
        System.out.println(ann.getInfo());
        break;
    }
  }
}
