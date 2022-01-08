/*
Frog Hats -- Kevin Cheng, Abdullah Faruque, Jason Zhou
APCS
Lab04 -- Never Fear, Big O is Here!
01-08-2021
*/

import java.util.ArrayList;

public class Sorts {
  public static int[] insertion( ArrayList<Comparable> data ) {
    int[] returnVals = new int[2];

    for(int partition = 1; partition < data.size(); partition++) {
     //partition marks first item in unsorted region

     // System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
     // System.out.println( data );

     //traverse sorted region from right to left
     for(int i = partition; i > 0; i--) {
      returnVals[1]++;

       // "walk" the current item to where it belongs
       // by swapping adjacent items
       if (data.get(i-1).compareTo(data.get(i)) > 0) {

         // System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag

         Comparable temp = data.get(i);
         data.remove(temp);
         data.add(i-1, temp);
         returnVals[0]++;

       }
       else
         break;
     }
   }
   return returnVals;
 }

 public static int[] selection( ArrayList<Comparable> data ) {
   //note: this version places greatest value at "rightmost" end
   int[] returnVals = new int[2];
   //maxPos will point to position of SELECTION (greatest value)
   int maxPos = 0;

   for(int pass = data.size(); pass > 0; pass--) {
     // System.out.println( "\nbegin pass " + (data.size()-pass) );//diag

     //check for greatest
     Comparable greatest = 0;
     for(int index = 0; index < pass; index++) {
       returnVals[1]++;
       if(data.get(index).compareTo(greatest) > 0) {
         greatest = data.get(index);
         maxPos = index;
       }
       // System.out.println( "maxPos: " + maxPos );//diag
       // System.out.println( data );//diag
     }

     //shift
     data.add(pass, data.get(maxPos));
     data.remove(data.get(maxPos));
     returnVals[0]++;

     //
     // System.out.println( "after swap: " +  data );//diag
   }
   return returnVals;
 }//end selectionSort

 public static int[] bubble( ArrayList<Comparable> data) {
  /* YOUR IMPLEMENTATION HERE */
  //further optimization
  // boolean isSorted = true;
  int[] returnVals = new int[2];


  int size = data.size();
  for (int i = 0; i < size; i++) {
    for (int j = size - 1; j > 0; j--) {
      //swapping
      // isSorted = true;

      returnVals[1]++;
      if (data.get(j).compareTo(data.get(j - 1)) < 0) {
        // isSorted = false; //you swap at least once
        int temp = (int) data.get(j);
        int temp2 = (int) data.get(j - 1);
        data.remove(j);
        data.add(j, temp2);
        data.remove(j - 1);
        data.add(j - 1, temp);
        returnVals[0]++;
      }

    }
    // if (isSorted) {
    //   break;
    //
    // }
  }
  return returnVals;
}

}
