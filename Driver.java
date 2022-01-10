/*
Frog Hats -- Kevin Cheng, Abdullah Faruque, Jason Zhou
APCS
Lab04 -- Never Fear, Big O is Here!
01-08-2021
*/

import java.util.*;
public class Driver {
  public static void main(String[] args) {
    ArrayList<Comparable> test1 = new ArrayList<Comparable>();
    ArrayList<Comparable> test2 = new ArrayList<Comparable>();
    ArrayList<Comparable> test3 = new ArrayList<Comparable>();
    ArrayList<Comparable> test4 = new ArrayList<Comparable>();
    ArrayList<Comparable> test5 = new ArrayList<Comparable>();
    ArrayList<Comparable> test6 = new ArrayList<Comparable>();
    for (int i = 10; i > 0; i--) {
      test1.add((Comparable) (i));
    }
    for (int i = 0; i < 10; i++) {
      test2.add((Comparable) (i));
    }
    for (int i = 100; i > 0; i--) {
      test3.add((Comparable) (i));
    }
    for (int i = 0; i < 100; i++) {
      test4.add((Comparable) (i));
    }
    for (int i = 1000; i > 0; i--) {
      test5.add((Comparable) (i));
    }
    for (int i = 0; i < 1000; i++) {
      test6.add((Comparable) (i));
    }

    System.out.println("Worst Case Scenario");
    System.out.println("Algorithm\tCounter\t\t10\t100\t1000");
    System.out.print("Insertion:\tSwaps:");
    System.out.print("\t\t"+Sorts.insertion(new ArrayList<Comparable>(test1))[0]);
    System.out.print("\t"+Sorts.insertion(new ArrayList<Comparable>(test3))[0]);
    System.out.println("\t"+Sorts.insertion(new ArrayList<Comparable>(test5))[0]);
    System.out.print("\t\tComparisons:");
    System.out.print("\t"+Sorts.insertion(new ArrayList<Comparable>(test1))[1]);
    System.out.print("\t"+Sorts.insertion(new ArrayList<Comparable>(test3))[1]);
    System.out.println("\t"+Sorts.insertion(new ArrayList<Comparable>(test5))[1]);
    System.out.print("\t\tPasses:");
    System.out.print("\t\t"+Sorts.insertion(new ArrayList<Comparable>(test1))[2]);
    System.out.print("\t"+Sorts.insertion(new ArrayList<Comparable>(test3))[2]);
    System.out.println("\t"+Sorts.insertion(new ArrayList<Comparable>(test5))[2]);
    System.out.print("Selection:\tSwaps:");
    System.out.print("\t\t"+Sorts.selection(new ArrayList<Comparable>(test1))[0]);
    System.out.print("\t"+Sorts.selection(new ArrayList<Comparable>(test3))[0]);
    System.out.println("\t"+Sorts.selection(new ArrayList<Comparable>(test5))[0]);
    System.out.print("\t\tComparisons:");
    System.out.print("\t"+Sorts.selection(new ArrayList<Comparable>(test1))[1]);
    System.out.print("\t"+Sorts.selection(new ArrayList<Comparable>(test3))[1]);
    System.out.println("\t"+Sorts.selection(new ArrayList<Comparable>(test5))[1]);
    System.out.print("\t\tPasses:");
    System.out.print("\t\t"+Sorts.selection(new ArrayList<Comparable>(test1))[2]);
    System.out.print("\t"+Sorts.selection(new ArrayList<Comparable>(test3))[2]);
    System.out.println("\t"+Sorts.selection(new ArrayList<Comparable>(test5))[2]);
    System.out.print("Bubble:\t\tSwaps:");
    System.out.print("\t\t"+Sorts.bubble(new ArrayList<Comparable>(test1))[0]);
    System.out.print("\t"+Sorts.bubble(new ArrayList<Comparable>(test3))[0]);
    System.out.println("\t"+Sorts.bubble(new ArrayList<Comparable>(test5))[0]);
    System.out.print("\t\tComparisons:");
    System.out.print("\t"+Sorts.bubble(new ArrayList<Comparable>(test1))[1]);
    System.out.print("\t"+Sorts.bubble(new ArrayList<Comparable>(test3))[1]);
    System.out.println("\t"+Sorts.bubble(new ArrayList<Comparable>(test5))[1]);
    System.out.print("\t\tPasses:");
    System.out.print("\t\t"+Sorts.bubble(new ArrayList<Comparable>(test1))[2]);
    System.out.print("\t"+Sorts.bubble(new ArrayList<Comparable>(test3))[2]);
    System.out.println("\t"+Sorts.bubble(new ArrayList<Comparable>(test5))[2]);
    System.out.println("Best Case Scenario");
    System.out.println("Algorithm\tCounter\t\t10\t100\t1000");
    System.out.print("Insertion:\tSwaps:");
    System.out.print("\t\t"+Sorts.insertion(new ArrayList<Comparable>(test2))[0]);
    System.out.print("\t"+Sorts.insertion(new ArrayList<Comparable>(test4))[0]);
    System.out.println("\t"+Sorts.insertion(new ArrayList<Comparable>(test6))[0]);
    System.out.print("\t\tComparisons:");
    System.out.print("\t"+Sorts.insertion(new ArrayList<Comparable>(test2))[1]);
    System.out.print("\t"+Sorts.insertion(new ArrayList<Comparable>(test4))[1]);
    System.out.println("\t"+Sorts.insertion(new ArrayList<Comparable>(test6))[1]);
    System.out.print("\t\tPasses:");
    System.out.print("\t\t"+Sorts.insertion(new ArrayList<Comparable>(test2))[2]);
    System.out.print("\t"+Sorts.insertion(new ArrayList<Comparable>(test4))[2]);
    System.out.println("\t"+Sorts.insertion(new ArrayList<Comparable>(test6))[2]);
    System.out.print("Selection:\tSwaps:");
    System.out.print("\t\t"+Sorts.selection(new ArrayList<Comparable>(test2))[0]);
    System.out.print("\t"+Sorts.selection(new ArrayList<Comparable>(test4))[0]);
    System.out.println("\t"+Sorts.selection(new ArrayList<Comparable>(test6))[0]);
    System.out.print("\t\tComparisons:");
    System.out.print("\t"+Sorts.selection(new ArrayList<Comparable>(test2))[1]);
    System.out.print("\t"+Sorts.selection(new ArrayList<Comparable>(test4))[1]);
    System.out.println("\t"+Sorts.selection(new ArrayList<Comparable>(test6))[1]);
    System.out.print("\t\tPasses:");
    System.out.print("\t\t"+Sorts.selection(new ArrayList<Comparable>(test2))[2]);
    System.out.print("\t"+Sorts.selection(new ArrayList<Comparable>(test4))[2]);
    System.out.println("\t"+Sorts.selection(new ArrayList<Comparable>(test6))[2]);
    System.out.print("Bubble:\t\tSwaps:");
    System.out.print("\t\t"+Sorts.bubble(new ArrayList<Comparable>(test2))[0]);
    System.out.print("\t"+Sorts.bubble(new ArrayList<Comparable>(test4))[0]);
    System.out.println("\t"+Sorts.bubble(new ArrayList<Comparable>(test6))[0]);
    System.out.print("\t\tComparisons:");
    System.out.print("\t"+Sorts.bubble(new ArrayList<Comparable>(test2))[1]);
    System.out.print("\t"+Sorts.bubble(new ArrayList<Comparable>(test4))[1]);
    System.out.println("\t"+Sorts.bubble(new ArrayList<Comparable>(test6))[1]);
    System.out.print("\t\tPasses:");
    System.out.print("\t\t"+Sorts.selection(new ArrayList<Comparable>(test2))[2]);
    System.out.print("\t"+Sorts.selection(new ArrayList<Comparable>(test4))[2]);
    System.out.println("\t"+Sorts.selection(new ArrayList<Comparable>(test6))[2]);
  }
}
