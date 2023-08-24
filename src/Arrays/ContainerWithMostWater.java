package Arrays;

public class ContainerWithMostWater {
    public static void main(String args[]){
        int [] height = {1,8,6,2,5,4,8,3,7};
        int left=0;
        int right=height.length-1;
        int max=0;

        while (left<right){
            int min=Math.min(height[left],height[right]);
            int len=right-left;
            int area=min*len;
            max=Math.max(area,max);

            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println(max);
    }
}
