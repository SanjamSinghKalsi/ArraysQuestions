String answer[] = new String[s1.length*s2.length];
        int counter = 0;
       for(int i=0;i<s1.length;i++){
            for(int j = 0;j<s2.length;j++){
                answer[counter] = s1[i]+s2[j];
                counter++;
            }
        } 
        return answer;
