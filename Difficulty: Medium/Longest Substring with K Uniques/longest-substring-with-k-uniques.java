class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        Map<Character,Integer> mp=new HashMap<>();
        int j=0;
        int maxlen=-1;
        for(int i=0; i<s.length(); i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            while(mp.size()>k){
                mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)-1);
                if(mp.get(s.charAt(j))==0) mp.remove(s.charAt(j));
                j++;
            }
            if(mp.size()==k) maxlen=Math.max(maxlen,i-j+1);
        }
        return maxlen;
    }
}