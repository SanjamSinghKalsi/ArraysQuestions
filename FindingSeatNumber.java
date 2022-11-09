 public static int findFriendSeatNo(String[] arr1, String[] arr2) {
        String answer = "";
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] == "Mridula"){
                answer = arr1[i-1];
                break;
            }
        }
        for(int j=0;j<arr2.length;j++){
            if(arr2[j]==answer){
                return j;
            }
        }
        return -1;
    }
