
//? 1. Program for Sum.


// public class methods {
//     static  int sum (int a , int b){     //* here (int a , int b)  are Parameters.
// return a+b;

//     }
//     public static void main(String[] args){

// System.out.println(sum(5,10));            //* here (5,10)are  Arguments


//     }

// }

//? 2. Program for 2'sTable.

public class methods1{
 static void twos_Table() { //? Funtion Declaration/ Definition 
    for(int i=0; i<=10;i++){
        int ans= 2*i;
        System.out.println("->"+ans);
    }

}


public static void main(){

    System.out.println("hi");
    twos_Table() ;  //! Function Calling 
    System.out.println("bye");

}}