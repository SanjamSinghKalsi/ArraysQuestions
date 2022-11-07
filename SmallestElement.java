  int answer= numbers[0];
        
        for(int i=0;i<numbers.length;i++){
                if(numbers[i]<answer){
                    answer = numbers[i];
                }
        }
        if(toReturn == "value"){
            return answer;
        }
        if(toReturn == "index"){
            int counter=0;
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]==answer){
                    break;
                }
                counter++;
            }
            return counter;
        }
        return -1;
