class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] heights2 = new int[n + 1];
        for(int i = 0; i < n; ++i) {
            heights2[i] = heights[i];
        }

        int maxArea = 0;

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < heights2.length; i++) {
            while(!stack.isEmpty() && heights2[i] < heights2[stack.peek()]) {
                int h = heights2[stack.pop()];
                int w = stack.isEmpty()? i: i - stack.peek() - 1;
                int area = h * w;
                maxArea = Math.max(maxArea, area);
            }
            stack.add(i);
        }
        return maxArea;
    }
}

// #Brute Force
// class Solution {
//     public int largestRectangleArea(int[] heights) {

//         int n = heights.length;
//         int maxArea = 0;

//         for(int i=0; i<n; i++){
//             int left = i, right = i;

//             while(left > 0 && heights[left-1] >= heights[i]){
//                 left--;
//             }

//             while(right < n-1 && heights[right+1] >= heights[i]){
//                 right++;
//             }

//             int width = right - left + 1;
//             int area = width * heights[i];
//             maxArea = Math.max(area, maxArea);
//         }
//         return maxArea;
//     }
// }
