Package Arrays;

public class ContainsMostWater {
   public static void main(String[] args) {
       int[] height = {1,8,6,2,5,4,8,3,7};
       System.out.println(maxArea(height));
   }

   public static int maxAreaBruteForce(int[] height) {
       int maxArea = 0;
       for (int i = 0; i < height.length; i++) {
           for (int j = i + 1; j < height.length; j++) {
               int area = Math.min(height[i], height[j]) * (j - i);
               maxArea = Math.max(maxArea, area);
           }
       }
       return maxArea;
   }

   public static int maxArea(int[] heights) {
        int l =0, r=heights.length-1,max_area = 0;
        while(l < r){
            int currentArea = Math.min(heights[l], heights[r]) * (r - l);
            max_area = Math.max(max_area,currentArea);
            if(heights[l] <= heights[r]){
                l++;
            }else{
                 r--;
            }
        }

        return max_area;
   }
}