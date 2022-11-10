
    static int totalStudents(int[][] matrix) {
        int answer= 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0 ;j<matrix[i].length;j++){
                answer += matrix[i][j];
            }
        }
        return answer;
    }
