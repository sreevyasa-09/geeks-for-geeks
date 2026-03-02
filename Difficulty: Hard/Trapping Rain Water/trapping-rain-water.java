class Solution {

    public int maxWater(int arr[]) {

        int n=arr.length;

        if(n==0) return 0;

        int l=0,r=n-1,ans=0;

        int maxL=arr[l],maxR=arr[r];

        while(l<r){

            if(maxL<maxR){

        ans+=maxL-arr[l];

        maxL=Math.max(maxL,arr[++l]);

            }else{

          ans+=maxR-arr[r];

          maxR=Math.max(maxR,arr[--r]);

            }

        }

        return ans;

    }

}
