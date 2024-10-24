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

class MedianOfTwoSortedArrays {

  public static double medianOfTwoSortedArrays(int[] n1,int[] n2){

int[] mergedArray = new int[n1.length + n2.length];

int i =0;
int j=0;
int k=0;

while(i<n1.length && j<n2.length){

  if(n1[i] < n2[j]){
    mergedArray[k++] = n1[i++];

  }else{
    mergedArray[k++] = n2[j++];
  }
}

while(j<n2.length){
  mergedArray[k++] = n2[j++];

}


int length = mergedArray.length;
if(length % 2==0)
{
  return ((double)mergedArray[length/2-1]+mergedArray[length/2])/2;

}else{
  return mergedArray[length/2];
}
  }





  public static void main(String[] args) {
    
  int[] n1 ={1,2};
  int[] n2 ={3,4};

  System.out.println("Median :" + medianOfTwoSortedArrays(n1, n2));


  }






}
