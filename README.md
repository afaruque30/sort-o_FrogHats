# sort-o_FrogHats
#### Kevin Cheng, Abdullah Faruque, Jason Zhou

#### SOTW - [Enchant by Ibrahim](https://open.spotify.com/track/0sMfigk2Kj6UHSTCdzSAda?si=5dde18d37deb4625)

## BubbleSort
* Best Case Scenario - We decided that the best case scenario for BubbleSort, and all the other sorting methods would be an ArrayList with all of its elements already sorted in ascending order. By having it already ordered, we would have done the methods job for it, which is why logically, it is the best case scenario. BubbleSort needed 0 swaps to sort a 10, 100, and 1000 sized ArrayList. However, it took 90, 9900, and 999000 comparisons. This is basically (n^2)-n comparisons, which makes BubbleSort of n^2 time complexity. When looking at the number of swaps, the time complexity is 1, since it remains at 0 for all there different lengths.

* Worst Case Scenario - We decided that the worse case scenario for BubbleSort would be an arrayList where all of its elements would be in descending order. This would require the most amounts of swaps, as it would have to move the last element all the way to the beginning through many swaps. BubbleSort did the same number of Comparisons as when it did with the best case scenario, showing that comparison is only dependent on size for this sorting method. This also means that the time complexity is n^2. The same can be seen for the swaps, as it is represented by (n^2)-(n/2).


## Selection Sort

* Best Case Scenario AND Worst Case Scenario- We decided that the "best case scenario" for Selection Sort would be an ArrayList with all of its elements already sorted in ascending order. By having it already ordered, we would have done the methods job for it, which is why logically, it is the best case scenario. However, in the case of Selection Sort, there really isn't a best or worst case scenario, as the number of swaps and comparisons is independent to the state of the the ArrayList. Our worst case scenario was an ArrayList in descending order. In both scenarios, Selection Sort took n amounts of swaps, and ((n^2)+n)/2 comparisons for both scenarios. Because time complexity looks at the overall number of operations, the n^2 from the comparions overrides the n from swaps, as the number of comparisons is much greater than the number of swaps, therfore it represents more of what is actually happening. This means that the time complexity for Selection Sort is n^2.

## Insertion Sort

* Best Case Scenario - We decided that the best case scenario for Insertion Sort would be an ArrayList with all of its elements already sorted in ascending order. By having it already ordered, we would have done the methods job for it, which is why logically, it is the best case scenario. Insertion Swap needed 0 swaps to sort a 10, 100, and 1000 sized ArrayList. However, it took 9, 99, and 999 comparisons. This is basically n-1 comparisons, which makes Insertion Sort of 1 time complexity. When looking at the number of swaps, the time complexity is also 1, since it remains at 0 for all there different lengths.

* Worst Case Scenario - We decided that the worse case scenario for Insertion Sort would be an arrayList where all of its elements would be in descending order. This would require the most amounts of swaps, as it would have to move the last element all the way to the beginning through many swaps. Insertion Sort required 45, 4950, and 499500 comparisons when the length was 10, 100, and 1000 respectively. This says that Insertion Sort is ((n^2)-n)/2. This  means that the time complexity is n^2 since it has n^2 in the equation. The number of swaps was the same as the number of comparisons, so it has the same equation, meaning that the time complextion is n^2 again.

## Best Case Scenario
| ALGORITHM       | SIZE         | 10      | 100           | 1000   |
|-----------------|:-------------|:-------:|--------------:|:------:|
| Insertion       | Swaps        | 0       | 0             | 0      |
|                 | Comparisons  | 9       | 99            | 999    |
| Selection       | Swaps        | 10      | 100           | 1000   |
|                 | Comparisons  | 55      | 5050          | 500500 |
| Bubble          | Swaps        | 0       | 0             | 0      |
|                 | Comparisons  | 90      | 9900          | 999000 |

## Worst Case Scenario
| ALGORITHM       | SIZE         | 10      | 100           | 1000   |
|-----------------|:-------------|:-------:|--------------:|:------:|
| Insertion       | Swaps        | 45      | 4950          | 499500 |
|                 | Comparisons  | 45      | 4950          | 499500 |
| Selection       | Swaps        | 10      | 100           | 1000   |
|                 | Comparisons  | 55      | 5050          | 500500 |
| Bubble          | Swaps        | 45      | 4950          | 499500 |
|                 | Comparisons  | 90      | 9900          | 999000 |
