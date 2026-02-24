/** 
	File Name: SequentialSearch
	Name: Youssef El-Aboudy
	Date: September 25th, 2024
	Description: searches an array
      */

//import packages
import java.util.*;

public class SequentialSearch{

   int Search (int array[], int x){
      int i = -1;
   
      for (int j = 0; j < array.length; j++){
         if (array[j] == x){
            i = j;
            return i;
         }
      }
   return i;
   }
   
}