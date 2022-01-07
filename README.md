# sort-o_FrogHats
#### Kevin Cheng, Abdullah Faruque, Jason Zhou

## Scenarios
* Best Case Scenario - We decided that it is when the elements inside the arraylist are already ordered, requiring 0 passes for all three sort methods.
* Worst Case Scenario - We decided that when the elements in the array were arranged in descending order, it would ressemble the worst case scenario as it would require the most number of swaps. 


## Sorts.java
* Contains bubble, insertion, and selection sort to be used in Driver.java. The methods were modified to contain a counter that counts the number of swaps that occur. 

## Driver.java
* Creates two arraylists, one for the best case scenario and one for the worst case scenario. Both arraylists are 1000 elements long. Each sort method is to sort each arraylist. Using this, we can determine which search method takes the least amount of time by seeing which search method uses the least amount of swaps. 
