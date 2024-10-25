/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {

  public static void sort(int[] a){


    for(int i=0; i<a.length-1; i +=2){

if(i>0 && a[i]<a[i-1]){
      int temp = a[i];
      a[i] = a[i-1];
      a[i-1] = temp;
    }

  if(i<a.length-1 && a[i]<a[i+1]){
    
      int temp = a[i];
      a[i] = a[i+1];
      a[i+1] = temp;
    }
  }
  }
  



  public static void main(String[] args) {
   
   int[] a ={10,5,6,3,2,20,100,80};

   sort(a);
   System.out.println(Arrays.toString(a));
  }
}
