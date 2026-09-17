
public class _2D_maxValue {

    public static void main(String args[]) {

        int arr[][]
                = {
                    {1,2,3},
                    {21,20,19},};

        int maxValue=arr[0][0];
        int row=0;
   int  col=0;
        for (int i = 0; i <= arr.length - 1; i++) {

            for (int j = 0; j <= arr[i].length - 1; j++) {
                if (arr[i][j]>maxValue){
                    maxValue=arr[i][j];
                    row=i;
                    col=j;
                }
            }

        }
        System.out.println( "The Maximum value of the array is :"+maxValue +" at index i =" + row + " j= " + col);
    }
}
