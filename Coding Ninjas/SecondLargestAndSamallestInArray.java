public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int max = -1;
	      int min = Integer.MAX_VALUE;        
	      int smax = -1;
        int smin = Integer.MAX_VALUE;
        int ret[] = new int [2];
        for (int i=0; i<n ; i++){
            if(max<a[i]){
                smax=max;
                max=a[i];
                }
            else if(smax<a[i]&&max!=a[i]){
                smax=a[i];
                }
            if(min>a[i]){
                smin=min;
                min=a[i];
                }
            else if(smin>a[i]&&min!=a[i]){
                smin=a[i];
                }
        }
        ret[0]=smax;
        ret[1]=smin;
        return ret;
	    }
}
