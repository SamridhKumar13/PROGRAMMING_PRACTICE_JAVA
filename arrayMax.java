public class arrayMax {
    
    public static void main (String [] args){
int [] arr={5,80,-60,70,6};
int max=arr[0];
int n=arr.length;
int index=0;
for(int i=0;i<=n-1;i++){
    if (arr[i]>max){

        max=arr[i];
         index=i;

    }
    
    
}
System.out.println("Maximum value of the array is: "+max + " is at index: "+index);


    }
}
