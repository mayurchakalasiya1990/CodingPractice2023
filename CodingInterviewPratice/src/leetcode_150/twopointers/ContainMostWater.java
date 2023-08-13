package leetcode_150.twopointers;

public class ContainMostWater {

    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        int area =0, res=0;
        int f = 0,r=height.length-1;

        while (f < r) {
         area = (r-f) * Math.min(height[f],height[r]);
         System.out.println("width: "+(r-f) +" "+ "Height: "+Math.min(height[f],height[r]));
         res = Math.max(area,res);
         System.out.println("Area:"+area+" "+"Result:"+res);
         if(height[f]<height[r]){
             f++;
         }else{
             r--;
         }
        }
        return area;
    }
}
