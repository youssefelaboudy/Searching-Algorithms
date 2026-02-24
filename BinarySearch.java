/** 
	File Name: BinarySearch
	Name: Youssef El-Aboudy
	Date: September 25th, 2024
	Description: searches an array for a value
      */

//import packages
import java.util.*;

public class BinarySearch{

   int binarySearch (int array[], int x){
      int bottom = 0;
      int top = array.length - 1;
      boolean found = false;
      int i = -1;
   
      while (bottom <= top && found == false){
         int middle = (bottom + top) /2;
      
         if (array[middle] == x){
            found = true;
            i = middle;
         }
         else if(x > array[middle]){
            bottom = middle +1;
         }
         else{
            top = middle - 1;
         }
      }
      return i;
   }   
}
