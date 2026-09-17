import java.util.Scanner;
public class input2Darray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[3][4];
       
        for (int i = 0; i<= arr.length-1;i++) {
            for(int j=0; j<=arr[i].length-1;j++ ){
                System.out.println("Enter the value of row  " + i+" and column " + j);
arr[i][j]=sc.nextInt();
            }
            
        }
for (int i =0; i<=arr.length-1; i++){
    for (int j=0; j<=arr[i].length-1;j++){
        
        System.out.print(arr[i][j] + " "); 
    }
    System.out.println(); 
}
sc.close();
}
}
