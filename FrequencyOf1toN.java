
class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int[] newArr = new int[100002];
        for(int i=0;i<N;i++){
            newArr[arr[i]] = newArr[arr[i]]+ 1; 
        }
        // for(int i=0;i<=P;i++){
        //     System.out.println(newArr[i]);
        // }
        
            for(int i=1;i<=N;i++){
            arr[i-1] = newArr[i];
        }
        
        
    }
}
