/*Q. Spiral Matrix

  Example 1:
Input: matrix = [[1,2,3],
                 [4,5,6],
                 [7,8,9]]
                 
Output: [1,2,3,6,9,8,7,4,5]

Code:*/

 class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int bot= matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
         ArrayList<Integer> arr = new ArrayList<>();
        int k=0;
        int dir=0;

        while(top<=bot & left<=right){
            if(dir==0){
                for(int i =left;i<=right;i++){
                   arr.add(matrix[top][i]); 
                }
                top++;
            }
            if(dir==1){
                 for(int i =top;i<=bot;i++){
                   arr.add(matrix[i][right]); 
                }
                right--;
            }
            if(dir==2){
                 for(int i =right;i>=left;i--){
                   arr.add(matrix[bot][i]); 
                }
                bot--;
            }
            if(dir==3){
                 for(int i =bot;i>=top;i--){
                   arr.add(matrix[i][left]); 
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return arr;
    }
}
