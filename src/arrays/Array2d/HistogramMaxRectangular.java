package arrays.Array2d;

class HistogramMaxRectangular {
    public static void main(String[] args) {
      int  arr[] = {60, 20, 50, 40, 10, 50, 60};
      System.out.println(getMaxArea(arr));
    }
    public static int getMaxArea(int arr[]) {
       int n = arr.length;
       int stack[] = new int[n+1];
       int index = -1;
       int max = Integer.MIN_VALUE;
       for(int i=0; i<=n; i++){
           int element = (i==n)?0:arr[i];
           while(index!=-1 && arr[stack[index]]> element){
               int h = arr[stack[index--]];
               int ps = (index==-1)?-1:stack[index];
               int w = i-ps -1;
               max = Math.max(max, h*w);
               
           }
           stack[++index] = i;
       }
        return (max==Integer.MIN_VALUE)?0:max;
    }
}
