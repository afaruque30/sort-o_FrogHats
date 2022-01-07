import java.util.*;
public class Driver {
  public static void main(String[] args) {
    ArrayList<Comparable> test1 = new ArrayList<Comparable>();
    ArrayList<Comparable> test2 = new ArrayList<Comparable>();
    for (int i = 1000; i > 0; i--) {
      test1.add((Comparable) (i));
    }
    for (int i = 0; i > 0; i++) {
      test2.add((Comparable) (i));
    }
    System.out.println("worst case scenario :");
    System.out.print("Insertion: ");
    System.out.println(Sorts.insertion(new ArrayList<Comparable>(test1)));
    System.out.print("Selection: ");
    System.out.println(Sorts.selection(new ArrayList<Comparable>(test1)));
    System.out.print("Bubble: ");
    System.out.println(Sorts.bubble(new ArrayList<Comparable>(test1)));
    System.out.println("best case scenario :");
    System.out.print("Insertion: ");
    System.out.println(Sorts.insertion(new ArrayList<Comparable>(test2)));
    System.out.print("Selection: ");
    System.out.println(Sorts.selection(new ArrayList<Comparable>(test2)));
    System.out.print("Bubble: ");
    System.out.println(Sorts.bubble(new ArrayList<Comparable>(test2)));


  }
}
