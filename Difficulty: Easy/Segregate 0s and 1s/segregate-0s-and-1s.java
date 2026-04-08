class Solution {
    void segregate0and1(int[] arr) {
        // code here
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                list.add(arr[i]);
            }else{
                list1.add(arr[i]);
            }
        }
        int j = list.size();
        int k = list1.size();
        int[] res = new int[j + k];
        for (int i = 0; i < j; i++) {
             res[i] = list.get(i);
        }
        for (int i = 0; i < k; i++) {
             res[j + i] = list1.get(i);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = res[i];
        }
    }
}
