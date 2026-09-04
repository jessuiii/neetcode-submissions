class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> row_column_subbox_table = new HashSet<>();
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                char num = board[i][j];
                if(num != '.'){
                    if(!row_column_subbox_table.add(num + "at row" + i)||
                    !row_column_subbox_table.add(num + "at column" + j)||
                    !row_column_subbox_table.add(num+"at subbox"+i/3+","+j/3))
                        return false;
                }
            }
        }
        return true;
    }
}