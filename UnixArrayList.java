 static List<String> lineNumbering(List<String> lines) {
      List<String> answer = new ArrayList<String>();
      for(int i = 0;i<lines.size();i++){
       
       String put = (i+1)+" "+lines.get(i);
       
        answer.add(put);
      }
      return answer;
    }
