/** 
	File Name: BinarySearchDescending
	Name: Youssef El-Aboudy
	Date: September 27th, 2024
	Description: searches an array in descending order for num
      */

//import packages
import java.util.*;

public class BinarySearchDescending{

   public static void main (String[] args){
      
      //initializing method
      BinarySearch bq = new BinarySearch();
      Scanner sc = new Scanner (System.in);
      
      //declaring variables
      int array[] = new int [20];
      int x;
   
      for (int i = array.length - 1; i >= 0; i--){
         array[i] = i+1;
      }
   
      x = sc.nextInt();
   
      System.out.print(bq.binarySearch(array,x));
   }//end of main method
   
}//end of class
