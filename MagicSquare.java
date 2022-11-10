    static boolean isMagicSquare(int[][] arr) {
        int size = 0;
        for(int i = 0;i<arr.length;i++){
            size++;
        }
        int sum = 0;
        int check = 0;
        int colCheck = 0;
        int diaCheck = 0;
        int antiCheck = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                     sum += arr[i][j];   
            }
            break;
           
        }
       
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                    check += arr[i][j];
                  colCheck += arr[j][i];
            }
          if(check!= sum || colCheck!=sum){
                return false;
            }
            else{
                check = 0;
                colCheck = 0;
            }
        }

       for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    diaCheck+= arr[i][j];
                  
                }
           
            }
       }
        
       if(diaCheck != sum){
           return false;
       }
         for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(j==size-i-1){
                    antiCheck+= arr[i][j];
            }
            }
        }
        if(antiCheck != sum){
            return false;
        }
       
        

        return true;
    }
