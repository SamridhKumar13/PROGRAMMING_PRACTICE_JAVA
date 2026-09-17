
public class Array2Dintro {

//     public static void main(String[] args) {
// //? Declaration of 2d array
//         int[][] arr;
// //? allocation  of Matrix
//         arr = new int[3][4];
//         //? initialization 
//         int[][] brr = {
//             {1, 2},
//             {2, 3},
//             {3, 4},
//             {4, 5}
//         }; 
// int rowlength=brr.length;
// int collength=brr[0].length;
// //System.out.println(collength); //? this will only work if all the rows having same number of columns.
// for(int  i=0;i<=rowlength-1;i++){
//     for(int j=0;j<=collength-1;j++)
//     {
//         System.out.print(brr[i][j] +" ");
//     }
//     System.out.println();
// }
//         //?  using for each loop 
//         // for(int []value:brr){
//         //     for(int a:value)
//         //     System.out.println(a);
//         // }
//     }
// }
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2}, {2, 3, 4, 5}, {3, 4, 5, 6, 7}, {4}

        };
        int rowlength=arr.length;

        for (int i= 0;i< rowlength; i++) {
            for(int j =0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");
            }

         
            System.out.println();
        }
    }}
