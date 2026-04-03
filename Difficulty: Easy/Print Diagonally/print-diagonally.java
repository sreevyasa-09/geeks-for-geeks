class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        int n = mat.length;
        int cnt = n + n - 1;
        int row = 0;
        int col = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(cnt > 0){
            int coll = Math.min(col, n-1);
            int rowl = Math.min(row, n-1);
            while(coll >= 0 && rowl < n){
                res.add(mat[rowl][coll]);
                rowl++;
                coll--;
            }
            col++;
            if(col >= n){
                row++;
            }
            cnt--;
        }
        return res;
    }
}
