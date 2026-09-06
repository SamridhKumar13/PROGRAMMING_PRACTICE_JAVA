//? in this program i will learn about function/method overloading

public class methodoverloading {

    

    static int add(int a, int b) {   //? method_1

        return a + b;

    }

    static int add(int a, int b, int c) { //? method_2 
        return a + b + c;

    }

    static double add(double a, double b) { //?method_3
        return a + b;

    }

    public static void main(String[] args) {

        System.out.println(add(5, 10));
        System.out.println(add(5, 10, 15));
        System.out.println(add(5.5, 5.5));

    }

}
