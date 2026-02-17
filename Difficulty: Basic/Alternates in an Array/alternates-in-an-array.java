class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n; i += 2){
            list.add(arr[i]);
        }
        return list;
    }
}