package Arrays;

public class LeftAndRightDifference {
    public static void main(String args[]){
        int [] nums = {10,4,8,3};
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for(int i=1;i<n;i++){
            leftSum[i]=leftSum[i-1]+nums[i-1];
        }

        for(int i=n-2;i>=0;i--){
            rightSum[i]=rightSum[i+1]+nums[i+1];
        }

        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
        }

        for(int i:ans) {
            System.out.println(i);
        }
    }
}
