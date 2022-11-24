
  static Boolean balancedToken(String name) {
    name = name.toLowerCase();
    int flag = 0;
    int check = 0;
     
    for(int i=0;i<name.length();i++){
      int counter = 0;
      for(int j = 0;j<name.length();j++){
        if(flag==0){
           if(name.charAt(i)==name.charAt(j)){
            check++; 
           }
        }
        else{
          if(name.charAt(i)==name.charAt(j)){
            counter++; 
           }
        }
        }
        if(flag==1){
        if(counter!=check){
           return false;
         }
        }
        
         flag=1;
         
      }
     return true;
    }
  
