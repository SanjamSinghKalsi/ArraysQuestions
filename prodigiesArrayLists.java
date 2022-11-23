
    static List chessProdigy(int[] rating) {
        int check = 0;
        List<Integer> answer = new ArrayList<Integer>();
        for(int i = rating.length-1;i>=0;i--){

            if(rating[i]>check){
                answer.add(rating[i]);
            }
            check = check + rating[i];
        }
        Collections.reverse(answer);
        return answer;
    }
