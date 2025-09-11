class Solution {
    public int heightChecker(int[] heights) {
        int []expected=new int[101];
        for(int height:heights){
            ++expected[height];
        }
        int height_ptr=1,count=0;
        for(int height:heights){
            while(expected[height_ptr]==0){
                ++height_ptr;
            }
            if(height_ptr!=height){
                ++count;
            }
            --expected[height_ptr];
        }
        return count;
    }
}

class Solution {
    public int heightChecker(int[] heights) {
        int []expected=heights.clone();
        int count=0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]>heights[j]){
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                }
            }
            if(expected[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}

