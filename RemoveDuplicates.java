
  static int[] distinctNumbers(int[] arr) {
     List<Integer> answer = new ArrayList<>();
   
    for(int i = 0;i<arr.length-1;i++){
        for(int j = i+1 ; j<arr.length;j++){
          if(arr[i]==arr[j]){
            arr[j]= -9999;
          }
        }
    }
    
 
   for(int i = 0 ;i<arr.length;i++){
     if(arr[i] == -9999){
       continue;
     }
     answer.add(arr[i]);
   }

  
    int[] ret = new int[answer.size()];
    for (int i=0; i < ret.length; i++)
    {
        ret[i] = answer.get(i).intValue();
    }
    return ret;
    //return array;
  }
