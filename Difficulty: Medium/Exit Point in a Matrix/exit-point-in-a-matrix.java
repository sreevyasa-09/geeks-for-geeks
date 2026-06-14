class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        int H = mat.length;
        int W = mat[0].length;
        // 0 -> right, 1 -> down, 2 -> left, 3 -> top
        int m = 0;
        int i = 0;
        int j = 0;
        
        while (true) {
            if (i == H) {
                i--;
                break;
            }
            if (i == -1) {
                i++;
                break;
            }
            if (j == W) {
                j--;
                break;
            }
            if (j == -1) {
                j++;
                break;
            }
            
            if (mat[i][j] == 1) {
                m++;
                mat[i][j] = 0;
            }
            
            if (m == 4) m = 0;
            
            switch (m) {
                case 0: {
                    j++;
                    break;
                }
                case 1: {
                    i++;
                    break;
                }
                case 2: {
                    j--;
                    break;
                }
                case 3: {
                    i--;
                    break;
                }
            }
        }
        
        return List.of(i, j);
    }
}