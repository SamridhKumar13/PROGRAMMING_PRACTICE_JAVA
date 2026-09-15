

public class _2D_multi {
    



    public static void main (String args[]){

int arr[][]=
{
{10,20,30,40},
{40,50,60,70},
{70,80,90,100}


};
int mux=1;
for (int i=0;i<=arr.length-1;i++){

    for (int j=0;j<=arr[i].length-1;j++){
        mux=mux*arr[i][j];
    }

}
System.out.println(mux);
    }
}
