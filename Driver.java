import java.util.*;
public class Driver {
  public static void main(String[] args) {
    ArrayList<Comparable> test1 = new ArrayList<Comparable>();
    ArrayList<Comparable> test2 = new ArrayList<Comparable>();
    for (int i = 1000; i > 0; i--) {
      test1.add((Comparable) (i));
    }
    for (int i = 0; i < 500; i++) {
      test2.add((Comparable) (i));
    }
    System.out.println("SWAPS:");
    System.out.println("I ALR KNOW Time complexity of all is O(n^2)");
    System.out.println("worst case scenario (greatest to least) ():");
    System.out.print("Insertion: ");
    System.out.println(Sorts.insertion(new ArrayList<Comparable>(test1))[0]);
    System.out.print("Selection: ");
    System.out.println(Sorts.selection(new ArrayList<Comparable>(test1))[0]);
    System.out.print("Bubble: ");
    System.out.println(Sorts.bubble(new ArrayList<Comparable>(test1))[0]);
    System.out.println("best case scenario (already sorted):");
    System.out.print("Insertion: ");
    System.out.println(Sorts.insertion(new ArrayList<Comparable>(test2))[0]);
    System.out.print("Selection: ");
    System.out.println(Sorts.selection(new ArrayList<Comparable>(test2))[0]);
    System.out.print("Bubble: ");
    System.out.println(Sorts.bubble(new ArrayList<Comparable>(test2))[0]);

    //Given an array w/ n length, selection sort always performs n passes

    System.out.println("\nPASSES: ");
    System.out.println("greatest to least");
    System.out.print("Insertion: ");
    System.out.println(Sorts.insertion(new ArrayList<Comparable>(test1))[1]);
    System.out.print("Selection: ");
    System.out.println(Sorts.selection(new ArrayList<Comparable>(test1))[1]);
    System.out.print("Bubble: ");
    System.out.println(Sorts.bubble(new ArrayList<Comparable>(test1))[1]);
    System.out.println("best case scenario (already sorted):");
    System.out.print("Insertion: ");
    System.out.println(Sorts.insertion(new ArrayList<Comparable>(test2))[1]);
    System.out.print("Selection: ");
    System.out.println(Sorts.selection(new ArrayList<Comparable>(test2))[1]);
    System.out.print("Bubble: ");
    System.out.println(Sorts.bubble(new ArrayList<Comparable>(test2))[1]);



  }
}
