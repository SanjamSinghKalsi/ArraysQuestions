    public static Integer matrixCenter(int[][] m) {
        int colLen = 0;
        int rowLen = 0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(i==0){
                    colLen++;
                }
            }
            rowLen++;
        }
        if(colLen %2 ==0 || rowLen %2 == 0){
            return null;
        }
        else{
             int midLine = (rowLen+1)/2;
                for(int i = 0 ; i<m.length;i++){
                    if(i==midLine-1){
                      for(int j =0 ;j<m[i].length;j++){
                      if(((colLen+1)/2)-1==j){
                         //  System.out.println(m[i][j]);
                           return m[i][j];
                       }
                    } 
                    }
                    
                }
                return null;
                
        }
    }
