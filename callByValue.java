

public class callByValue {
 void solve( int num){               //? Function/Method Decleration.

    System.out.println("Inside solve function: "+num);
    num=num*10;
System.out.println("Inside solve function: "+num);
 }

void main() {
    int num=5;
    System.out.println("In main function: "+num);
    solve(num);                   //? Function/method calling, here copy of num is passed. 
System.out.println("In main function: "+num);


}
    
}
