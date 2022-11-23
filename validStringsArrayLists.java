
    public static List<String> atlas(List<String> words) {
        List<String> answer = new ArrayList<String>();
        for(int i = 0 ;i<words.size()-1;i++){
            if(words.get(i) == ""){
                
                break;
            }
            if( words.get(i+1)==""|| words.get(i).charAt(words.get(i).length()-1)!=words.get(i+1).charAt(0))
            {
                 answer.add(words.get(i));
                break;      
            }
            answer.add(words.get(i));
            if(i+2==words.size()){
                      answer.add(words.get(i+1));
                }
        }
        System.out.println(answer);
        return answer;
    }
