//*****************************************************************
//Sorting.java
//@author(s) Chien Lin, Lena Zheng, Qian Dong Li
//Sorts lists according to descending order
//********************************************************************

public class Sorting
{
   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the selection
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void selectionSort (Comparable[] list)
   {
      int max;
      Comparable temp;

      //loop through the list, if any value is greater than the current max, then swap the values
      for (int index = 0; index < list.length-1; index++)
      {
         max = index;
         for (int scan = index+1; scan < list.length; scan++)
            if (list[scan].compareTo(list[max]) > 0) //if the current item is greater than the max, then change the new max
               max = scan;

         // Swap the values
         temp = list[max];
         list[max] = list[index];
         list[index] = temp;
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void insertionSort (Comparable[] list)
   {
      // loop through the list
      for (int index = 1; index < list.length; index++)
      {
         Comparable key = list[index];
         int position = index;

         //  Shift larger values to the left
         while (position > 0 && key.compareTo(list[position-1]) > 0)
         {
            list[position] = list[position-1];
            position--;
         }
            
         list[position] = key;
      }
   }
}
