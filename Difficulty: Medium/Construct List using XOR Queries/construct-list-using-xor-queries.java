class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        ArrayList<Integer> list = new ArrayList<Integer>(queries.length+1);
        
        int cXor = 0; // Xoring any number by 0 is the number itself
        
        // We compute from backwards in order to xor-cancel
        for (int x = queries.length - 1; x >= 0; x--) {
            int[] q = queries[x];
            int a = q[0]; // Action
            int d = q[1]; // Data
            
            // Insert otherwise XOR
            if (a == 0) {
                list.add(d ^ cXor);
            } else {
                cXor ^= d;
            }
        }
        
        // Xor the first element
        list.add(cXor);
        
        Collections.sort(list);
        
        return list;
    }
}