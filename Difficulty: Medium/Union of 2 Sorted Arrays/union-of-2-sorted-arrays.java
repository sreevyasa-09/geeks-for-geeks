class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        ArrayList<Integer> union = new ArrayList<>();
        for(int i = 0; i < a.length; i++)
            freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
        for(int i = 0; i < b.length; i++)
            freq.put(b[i], freq.getOrDefault(b[i], 0) + 1);
        for(int key: freq.keySet())
            union.add(key);
    return union;
    }
}
