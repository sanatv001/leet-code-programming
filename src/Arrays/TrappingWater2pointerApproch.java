package Arrays;

public class TrappingWater2pointerApproch {

    public static void main(String args[]){
        int[] trapArr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n=trapArr.length;
        if(n<=2){
            System.out.println(0);
        }
        int leftmax=0, rightmax=0;
        int left=0, right=n-1;
        int trappedwater=0;

        while (left<right){
            if(trapArr[left]<=trapArr[right]){
                leftmax=Math.max(leftmax,trapArr[left]);
                trappedwater+=leftmax-trapArr[left];
                left++;
            }
            else {
                rightmax=Math.max(rightmax,trapArr[right]);
                trappedwater+=rightmax-trapArr[right];
                right--;
            }
        }
        System.out.println(trappedwater);
    }
}
