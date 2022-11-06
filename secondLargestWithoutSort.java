
class Solution {
    int print2largest(int arr[], int n) {
        int largest = -9999999;
        int secondLargest = -9999999;

      int temp;
        
      for(int i = 0;i<n;i++){
          if(arr[i]>largest){
              temp = largest;
              largest = arr[i];
              secondLargest = temp;
          }
          else if ( arr[i]> secondLargest && arr[i]!=largest){
              secondLargest = arr[i];
          }
           
           
      }
      if(largest == secondLargest || secondLargest == -9999999){
          return -1;
      }

  
    
        return secondLargest;
    }}
