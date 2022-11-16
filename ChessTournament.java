static String chessGrandmaster(String[] x) {
      int wins = 0;
      for(int i =0 ;i<x.length;i++){
        if(x[i]=="Win"){
          wins++;
        }
      }
      if(wins<=0){
        return "Master";
      }
      else if(wins>=5){
        return "Grand Master";
      }
      else{
        return "International Master";
      }
    }
