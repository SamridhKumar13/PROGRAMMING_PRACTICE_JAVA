
public class _2D_Sum {
    
    public static void main (String args[]){

int arr[][]=
{
{10,20,30,40},
{40,50,60,70},
{70,80,90,100}


};
int Sum=0;
for (int i=0;i<=arr.length-1;i++){

    for (int j=0;j<=arr[i].length-1;j++){
        Sum=Sum+arr[i][j];
    }

}
System.out.println(Sum);
    }
}
