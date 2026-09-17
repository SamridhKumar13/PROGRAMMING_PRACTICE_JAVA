public class arrayMinValue {
    void  main(){

        int []arr={10,-5,-15,80,60};
        int n=arr.length;
        int min_value=arr[0];
        int index=0;
        for(int i=0;i<=n-1;i++){
if(arr[i]<min_value){
min_value=arr[i];
index=i;

}

        }


System.out.println("The minimum value of the array is: "+min_value+" at index :"+index);
    }
    
}
