
## code challenge 26 Insertion Sort 

Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

### Pseudocode
    InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
        
### Trace
Sample Array: [8,4,23,42,16,15]


### Efficiency

Time: O(n^2)


### Solution
![insertion](resources/assets/insertion.jpg)



## code challenge 27 merge Sort

Merge sort is a divide-and-conquer algorithm based on the idea of breaking down a list into several sub-lists until each sublist consists of a single element and merging those sublists in a manner that results into a sorted list. Idea: Divide the unsorted list into sublists, each containing element.
### Pseudocode
   ALGORITHM Mergesort(arr)
       DECLARE n <-- arr.length

       if n > 1
         DECLARE mid <-- n/2
         DECLARE left <-- arr[0...mid]
         DECLARE right <-- arr[mid...n]
         // sort the left side
         Mergesort(left)
         // sort the right side
         Mergesort(right)
         // merge the sorted left and right sides together
         Merge(left, right, arr)

   ALGORITHM Merge(left, right, arr)
       DECLARE i <-- 0
       DECLARE j <-- 0
       DECLARE k <-- 0

       while i < left.length && j < right.length
           if left[i] <= right[j]
               arr[k] <-- left[i]
               i <-- i + 1
           else
               arr[k] <-- right[j]
               j <-- j + 1

           k <-- k + 1

       if i = left.length
          set remaining entries in arr to remaining values in right
       else
          set remaining entries in arr to remaining values in left


### Trace
Sample Array: [8,4,23,42,16,15]


### Efficiency
Time: O(n^2)

### Solution
![merge](resources/assets/27.jpg)
