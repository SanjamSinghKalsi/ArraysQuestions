
    public static int cubeSum(int[] arr) {
      int answer = 0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            answer += Math.pow(arr[i],3);
        }
      }
      return answer;
    }
