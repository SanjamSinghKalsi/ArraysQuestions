
    static int modeFrequency(int[] arr) {
        int mode = 1;
        for(int i = 0 ;i<arr.length;i++){
            int check = 1;
            for(int j= i+1;j<arr.length;j++){
                
                if(arr[i]==arr[j]){
                    check++;
                }
            }
            if(check>mode){
                mode = check;
            }
        }
        System.out.println(mode);
        return mode;
    }
