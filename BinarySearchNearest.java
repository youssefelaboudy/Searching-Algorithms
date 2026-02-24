/** 
	File Name: BinarySearchNearest
	Name: Youssef El-Aboudy
	Date: September 27th, 2024
	Description: returns index of input if not found, outputs the index of number closest to that value
      */

//import packages
import java.util.*;

public class BinarySearchNearest{

   int binarySearchNear (int array[], int x){
   //declaring variables
      int bottom = 0;
      int top = array.length - 1;
      boolean found = false;
      int i = -1;
      
      //initial search if value is present in array
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
      
      //stores first value (middle value)
      int smallestNum = array[(bottom+top)/2];
      //cant have boolean cuz we wanna search through whole array
      while (bottom <= top){
         int middle = (bottom + top) /2;
         //checks through entire array if there is a number near input and will only store the smallest one
         if (array[middle] == x + 1 || array[middle] == x - 1){
            if (array[middle] <= smallestNum){
               smallestNum = array[middle];
               i = middle;
            }
         }
         else if(x > array[middle]){
            bottom = middle +1;
         }
         else{
            top = middle - 1;
         }
      }
   
      return i;
   } //end of method  
}//end of class