import java.util.Arrays;

public class Algorithm {

    //Search the target and return then index
     int linearSearch(int[] arr, int target){
        if(arr.length ==0){
            return -1;
        }
        for(int i =0; i< arr.length;i++){
            int element = arr[i];
            if(element == target ){
                return i;
            }
        }
        return -1;
    }
    // search target and return the element using for each loop
     int linearSearch2(int[] arr, int target){
        if(arr.length ==0){
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    //Searching the character in String
    boolean searchChar(String name, char ch){
         if(name.length() == 0){
             return false;
         }
        for (int i = 0; i < name.length(); i++) {
            if(ch == name.charAt(i)){
                return true;
            }

        }
        return false;
    }

    // Searching the  character using for each loop
    boolean searchChar2(String name, char ch){
        if(name.length() == 0){
            return false;
        }
       for( char c : name.toCharArray()){
           if(c == ch){
               return true;
           }

        }
        return false;
    }
    // Search within a range
    int searchInRange(int[] arr, int target , int start , int end){
         if(arr.length == 0){
             return -1;
         }

         for(int i = start; i<=end; i++){
             if(target == arr[i]){
                 return i;
             }
         }
         return -1;
    }
    // [ 10,-1,12,30,-8]
    int minValue(int[] arr){
         int min = Integer.MAX_VALUE;
         for(int i=0;i<arr.length;i++){
             if(arr[i]< min){
                 min = arr[i];
             }
         }
         return min;
    }

    //Binary Search Algorithm
    int binarySearch(int[] arr, int target ){
         // -> To Sort the array in ascending order or in descending order

         int start =0;
         int end = arr.length -1;
         //Run the loop while start is less than or equal to end
         while(start <= end){
             //Find the mid value of the array using this formula
             // 0 + ( 10 - 0) / 2 = 5 so the mid value is five
             int mid = start + (end - start) / 2;

             // if the target element is less than arr of mid element then change the value of end = mid -1
             if(target < arr[mid]){
                 end = mid -1;
             }

             // or else target greater than arr of mid element then change the value of start to mid +1
             else if( target > arr[mid]){
                 start = mid + 1;
             }
             // else the return mid value because u will figure it out the mid value
             // so the mid value will be the last answer
             else{
                 return mid;
             }
         }
         // nothing found means then return -1;
         return -1;
    }
    // what about we dont know the array is in ascending or descending order
    int orderAgnosticBS(int[] arr , int target ){
         int start =0;
         int end = arr.length -1;

         boolean asc = arr[start] < arr[end];

         while(start <= end){
             int mid = start + (end - start) /2 ;
             if(arr[mid]==target){
                 return mid;
             }

             if(asc){
                 if(target < arr[mid]){
                     end = mid - 1;
                 }
                 else{
                     start = mid + 1;
                 }
             }
             else {
                 if(target > arr[mid]){
                     end = mid - 1;
                 }
                 else {
                     start = mid + 1;
                 }
             }
         }
         return -1;
    }

    // binary search involved
    // Find the smallest number  in array that greater than or equal to target
    int  ceiling(int[] arr , int target){


        if(target > arr[arr.length -1]){
            return -1;
        }
         int start = 0;
         int end = arr.length -1;

         while(start <= end){
             int mid = start + (end - start )/2;


             if(target < arr[mid]){
                 end = mid -1;
             }
             else if( target > arr[mid]){
                 start = mid + 1;
             }
             else {
                 return mid;
             }
         }
         // smallest number in array that greater than or equal to target will be stored in start because of start breaching the loop
         return start;
    }

    // Linear method for ceiling sum
    // Find the smallest number  in array that greater than or equal to target
    int ceilLinear(int[] arr, int target ){
         for(int i=0;i<arr.length;i++){
             if(arr[i] >= target){
                 return i;
             }
         }
         return -1;
    }
    // Binary search
    // Find the greatest number in array that smaller than or equal to target
    int floorOfTheNumber(int[] arr, int target ){
         int start =0;
         int end = arr.length -1;

         while(start <= end ){
             int mid = start + (end - start)/2;
             if(target < arr[mid]){
                 end = mid -1;
             }
             else if( target > arr[mid]){
                 start = mid +1;
             }
             else{
                 return mid;
             }
         }
         // returning the end value because start will be breaching  the loop so the greatest number in array that is smaller than target will be in the end
         return end;
    }



}
